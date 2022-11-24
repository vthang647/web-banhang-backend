package com.ky6.assment_java6.controllers;

import com.ky6.assment_java6.entities.Customers;
import com.ky6.assment_java6.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CustomerController {
    @Autowired
    CustomersService customersService;

    @GetMapping("/admin/customer/getAll")
    public ResponseEntity<List<Customers>> getAllCustomer(){
        return new ResponseEntity<>(customersService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/admin/customer/add")
    public ResponseEntity<Customers> addCustomer(@RequestBody Customers customers){
        customersService.save(customers);
        return new ResponseEntity<>(customers, HttpStatus.CREATED);
    }

    @PutMapping("/admin/customer/edit")
    public ResponseEntity<Customers> editCustomer(@RequestBody Customers customers){
        customersService.save(customers);
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @DeleteMapping("/admin/customer/delete/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable(name = "id") String id){
        customersService.deleteById(Integer.parseInt(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
