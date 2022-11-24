package com.ky6.assment_java6.controllers;

import com.ky6.assment_java6.entities.Roles;
import com.ky6.assment_java6.entities.Staff;
import com.ky6.assment_java6.services.RolesService;
import com.ky6.assment_java6.services.StaffsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class RolesController {
    @Autowired
    RolesService rolesService;

    @GetMapping("/admin/roles/getAll")
    public ResponseEntity<List<Roles>> getAllRole(){
        return new ResponseEntity<>(rolesService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/admin/roles/add")
    public ResponseEntity<Roles> addRoles(@RequestBody Roles roles){
        rolesService.save(roles);
        return new ResponseEntity<>(roles, HttpStatus.CREATED);
    }

    @PutMapping("/admin/roles/edit")
    public ResponseEntity<Roles> editRoles(@RequestBody Roles roles){
        rolesService.save(roles);
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }

    @DeleteMapping("/admin/roles/delete/{id}")
    public ResponseEntity<?> deleteRoles(@PathVariable(name = "id") String id){
        rolesService.deleteById(Integer.parseInt(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
