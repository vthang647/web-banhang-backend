package com.ky6.assment_java6.controllers;

import com.ky6.assment_java6.entities.Bill;
import com.ky6.assment_java6.entities.Cart;
import com.ky6.assment_java6.services.BillService;
import com.ky6.assment_java6.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CartController {
    @Autowired
    CartService cartService;

    @GetMapping("/admin/cart/getAllCart")
    public ResponseEntity<List<Cart>> getAllCart(){
        return new ResponseEntity<>(cartService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/admin/cart/add")
    public ResponseEntity<Cart> addCart(@RequestBody Cart cart){
        cartService.save(cart);
        return new ResponseEntity<>(cart, HttpStatus.CREATED);
    }

    @PutMapping("/admin/cart/edit")
    public ResponseEntity<Cart> editCart(@RequestBody Cart cart){
        cartService.save(cart);
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }

    @DeleteMapping("/admin/cart/delete/{id}")
    public ResponseEntity<?> editCart(@PathVariable(name = "id") String id){
        cartService.deleteById(Integer.parseInt(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
