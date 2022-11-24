package com.ky6.assment_java6.controllers;

import com.ky6.assment_java6.entities.Bill;
import com.ky6.assment_java6.repositories.BillRepository;
import com.ky6.assment_java6.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class BillController {

    @Autowired
    BillService billService;

    @GetMapping("/admin/bill/getAllBill")
    public ResponseEntity<List<Bill>> getAllBill(){
        return new ResponseEntity<>(billService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/admin/bill/add")
    public ResponseEntity<Bill> addBill(@RequestBody Bill bill){
        billService.save(bill);
        return new ResponseEntity<>(bill, HttpStatus.CREATED);
    }

    @PutMapping("/admin/bill/edit")
    public ResponseEntity<Bill> editBill(@RequestBody Bill bill){
        billService.save(bill);
        return new ResponseEntity<>(bill, HttpStatus.OK);
    }

    @DeleteMapping("/admin/bill/delete/{id}")
    public ResponseEntity<?> editBill(@PathVariable(name = "id") String id){
        billService.deleteById(Integer.parseInt(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
