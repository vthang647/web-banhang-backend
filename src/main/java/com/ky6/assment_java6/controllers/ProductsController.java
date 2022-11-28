package com.ky6.assment_java6.controllers;

import com.ky6.assment_java6.entities.ProductLine;
import com.ky6.assment_java6.entities.Products;
import com.ky6.assment_java6.services.ProductLineService;
import com.ky6.assment_java6.services.ProductService;
import com.ky6.assment_java6.utils.StringGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class ProductsController {
    @Autowired
    private ProductService productsService;

    @Autowired
    private StringGenerateService stringGenerateService;

    @Autowired
    private ProductLineService productLineService;

    @GetMapping("/get-list-products")
    public List<Products> findAllProduct(){
        return productsService.findAll();
    }

    @GetMapping("/admin/get-list-products")
    public List<Products> getAllProduct(){
        return productsService.findAll();
    }

    @GetMapping("/admin/products/findByName")
    public List<Products> getProductByName(@RequestParam(name = "keyword") String keyword){
        return productsService.findBynameProduct(keyword);
    }

    @GetMapping("/admin/products/filterAllProduct")
    public List<Products> getProductsBySoftPrice(@RequestParam(name = "soft") int soft){
        if (soft==0){
            return productsService.sorfByPriceProductAllDown();
        }
        return productsService.sorfByPriceProductAllUp();
    }

    @GetMapping("/admin/products/findByIdPl")
    public List<Products> getProductByIdpl(@RequestParam(name = "category") String id){
        return productsService.findProductByPl(id);
    }

    @GetMapping("/admin/products/filter")
    public List<Products> getProductByIdPlSoft(@RequestParam(name = "soft") int soft,
                                               @RequestParam(name = "category") String id){
        if (soft==0){
            return productsService.sorfByPriceDOWN(id);
        }
        return productsService.sorfByPriceUP(id);
    }

    @PostMapping("/admin/products/add")
    public ResponseEntity<Products> addProduct(@RequestBody Products products){
        products.setCode(stringGenerateService.givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect());
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
