package com.ky6.assment_java6.controllers;

import com.ky6.assment_java6.entities.ProductLine;
import com.ky6.assment_java6.services.ProductLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class ProductLineController {

    @Autowired
    ProductLineService productLineService;

    @GetMapping("list-product-line")
    public List<ProductLine> findAllProductLine(){
        return productLineService.findAll();
    }

    @GetMapping("admin/productLine")
    public List<ProductLine> showAllProductLine(){
        return productLineService.findAll();
    }

    @PostMapping("admin/productLine/add-product-line")
    public ResponseEntity<ProductLine> addNewProductLine(@RequestBody ProductLine pro){
        productLineService.save(pro);
        return new ResponseEntity<>(pro, HttpStatus.OK);
    }

    @PutMapping("admin/productLine/update-product-line")
    public ResponseEntity<ProductLine> updateProductLine(@RequestBody ProductLine pro){
        System.out.println("idpr:"+pro.getIdPl()+", name: "+pro.getNameProductLine());
        productLineService.save(pro);
        return new ResponseEntity<>(pro, HttpStatus.OK);
    }

    @DeleteMapping("admin/productLine/delete/{id}")
    public ResponseEntity<?> deleteProductLine(@PathVariable("id") Long id){
        Optional<ProductLine> productLine = productLineService.findById(id);
        productLineService.deleteById(id);
        return new ResponseEntity<>(productLine.get(),HttpStatus.OK);
    }
}
