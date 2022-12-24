package com.ky6.assment_java6.services;

import com.ky6.assment_java6.dto.User;
import com.ky6.assment_java6.entities.Roles;
import com.ky6.assment_java6.entities.Staff;

public interface UserService {
    Staff saveUser(User user);
    Roles saveRole(Roles roles);
    void addRoleToUser(String username, String role);
    Staff getUser(String username);

    Staff login(String username, String password);
}
