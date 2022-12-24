package com.ky6.assment_java6.services.imp;

import com.ky6.assment_java6.dto.User;
import com.ky6.assment_java6.entities.Roles;
import com.ky6.assment_java6.entities.Staff;
import com.ky6.assment_java6.services.RolesService;
import com.ky6.assment_java6.services.StaffsService;
import com.ky6.assment_java6.services.UserService;
import com.ky6.assment_java6.utils.StringGenerateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImp implements UserDetailsService, UserService {

    private final StaffsService staffsService;
    private final RolesService rolesService;
    private final PasswordEncoder passwordEncoder;
    private final StringGenerateService stringGenerateService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Staff user = staffsService.findByUsername(username);
        if (user == null) {
            log.error("User not found in database");
            throw new UsernameNotFoundException("User not found in the database");
        }else {
            log.info("User found in database");
        }
        Collection<SimpleGrantedAuthority> authorities =new ArrayList<>();
        user.getRoles().forEach(roles -> authorities.add(new SimpleGrantedAuthority(roles.getNameRole())));
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPasswd(), authorities);
    }

    @Override
    public Staff saveUser(User user) {
        Staff staff = new Staff();
        staff.setUsername(user.getUsername());
        staff.setPasswd(passwordEncoder.encode(user.getPassword()));
        staff.setCode("staff"+ stringGenerateService.givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect());
        return staffsService.save(staff);
    }

    @Override
    public Roles saveRole(Roles roles) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, String role) {

    }

    @Override
    public Staff getUser(String username) {
        return null;
    }

    @Override
    public Staff login(String username, String password) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        org.springframework.security.core.userdetails.User user =(org.springframework.security.core.userdetails.User) auth.getPrincipal();
        log.info("user principal: {}", user.getUsername());
        log.info("passwd principal: {}", user.getPassword());
        if (user.getUsername() == username && passwordEncoder.encode(password) == user.getPassword()){
            log.info("login successfully!!");
            return staffsService.findByUsername(username);
        }else{
            log.error("Login failed");
            return null;
        }
    }
}
