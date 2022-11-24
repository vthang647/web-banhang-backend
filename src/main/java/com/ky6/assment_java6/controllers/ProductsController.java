package com.ky6.assment_java6.controllers;

import com.ky6.assment_java6.entities.Products;
import com.ky6.assment_java6.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProductsController {
    @Autowired
    private ProductService productsService;

    @GetMapping("/get-list-products")
    public List<Products> findAllProduct(){
        return productsService.findAll();
    }

    @GetMapping("/admin/get-list-products")
    public List<Products> getAllProduct(){
        return productsService.findAll();
    }


    @PostMapping("/admin/products/add")
    public ResponseEntity<Products> addProduct(@RequestBody Products products){
        productsService.save(products);
        return new ResponseEntity<>(products, HttpStatus.CREATED);
    }

    @PutMapping("/admin/products/edit")
    public ResponseEntity<Products> editProduct(@RequestBody Products products){
        productsService.save(products);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @DeleteMapping("/admin/products/delete/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable(name = "id") String id){
        productsService.deleteById(Integer.parseInt(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
