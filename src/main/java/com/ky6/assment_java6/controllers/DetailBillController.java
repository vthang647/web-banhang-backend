package com.ky6.assment_java6.controllers;

import com.ky6.assment_java6.entities.Cart;
import com.ky6.assment_java6.entities.DetailBill;
import com.ky6.assment_java6.services.CartService;
import com.ky6.assment_java6.services.DetailBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class DetailBillController {
    @Autowired
    DetailBillService detailBillService;

    @GetMapping("/admin/detail-bill/getAllCart")
    public ResponseEntity<List<DetailBill>> getAllDetailBill(){
        return new ResponseEntity<>(detailBillService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/admin/detail-bill/add")
    public ResponseEntity<DetailBill> addDetailBill(@RequestBody DetailBill detailBill){
        detailBillService.save(detailBill);
        return new ResponseEntity<>(detailBill, HttpStatus.CREATED);
    }

    @PutMapping("/admin/detail-bill/edit")
    public ResponseEntity<DetailBill> editDetailBill(@RequestBody DetailBill detailBill){
        detailBillService.save(detailBill);
        return new ResponseEntity<>(detailBill, HttpStatus.OK);
    }

    @DeleteMapping("/admin/detail-bill/delete/{id}")
    public ResponseEntity<?> editDetailBill(@PathVariable(name = "id") String id){
        detailBillService.deleteById(Integer.parseInt(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
