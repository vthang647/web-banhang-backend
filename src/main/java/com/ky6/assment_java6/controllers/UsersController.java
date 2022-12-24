package com.ky6.assment_java6.controllers;

import com.ky6.assment_java6.entities.Staff;
import com.ky6.assment_java6.services.StaffsService;
import com.ky6.assment_java6.services.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsersController {

    @Autowired
    StaffsService staffsService;

    @Autowired
    UserService userService;

    @PostMapping("/api/login")
    public ResponseEntity<Staff> login(@RequestBody UsernameAndPasswd uAndp){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/login").toUriString());
        Staff staff = userService.login(uAndp.getUsername(), uAndp.getPassword());
        System.out.println("usernameL: "+ uAndp.getUsername()+ ", password: "+ uAndp.getPassword());
        return  ResponseEntity.created(uri).body(staff);
//        return new ResponseEntity<>(staff, HttpStatus.OK);
    }

//    @GetMapping("/api/login")
//    public ResponseEntity<List<Staff>> getlogin(){
//        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/login").toUriString());
//        List<Staff> staff = staffsService.findAll();
//        return  ResponseEntity.created(uri).body(staff);
////        return new ResponseEntity<>(staff, HttpStatus.OK);
//    }
}

@Data
class UsernameAndPasswd {
    private String username;
    private String password;
}