package com.ky6.assment_java6.controllers;

import com.ky6.assment_java6.entities.Staff;
import com.ky6.assment_java6.services.StaffsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StaffsController {

    @Autowired
    StaffsService staffsService;

    @GetMapping("/admin/staffs/getAll")
    public ResponseEntity<List<Staff>> getAllStaff(){
        return new ResponseEntity<>(staffsService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/admin/staffs/add")
    public ResponseEntity<Staff> addStaff(@RequestBody Staff staff){
        staffsService.save(staff);
        return new ResponseEntity<>(staff, HttpStatus.CREATED);
    }

    @PutMapping("/admin/staffs/edit")
    public ResponseEntity<Staff> editStaff(@RequestBody Staff staff){
        staffsService.save(staff);
        return new ResponseEntity<>(staff, HttpStatus.OK);
    }

    @DeleteMapping("/admin/staffs/delete/{id}")
    public ResponseEntity<?> deleteStaff(@PathVariable(name = "id") String id){
        staffsService.deleteById(Integer.parseInt(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
