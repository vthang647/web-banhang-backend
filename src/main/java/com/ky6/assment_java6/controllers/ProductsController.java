package com.ky6.assment_java6.controllers;

import com.ky6.assment_java6.entities.Products;
import com.ky6.assment_java6.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProductsController {
    @Autowired
    private ProductService productsService;

    @PostMapping("/add-new-product")
    public String addProduct(@RequestBody Products products){
        productsService.save(products);
        return "Hi : "+ products.getNameProduct() + " , You Registration process successfully completed!";
    }

    @GetMapping("/get-list-products")
    public List<Products> findAllProduct(){
        return productsService.findAll();
    }

//    @GetMapping("/find-products/{Id}")
//    public List<Products> findProductWithId(@PathVariable String Id){
//        return productsService.findById(Long.parseLong(Id));
//    }
}
