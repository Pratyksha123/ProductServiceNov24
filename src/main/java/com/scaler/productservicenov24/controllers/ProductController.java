package com.scaler.productservicenov24.controllers;

import com.scaler.productservicenov24.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/{productId}")
    public Product getSingleProduct(@PathVariable("productId") Long productId){

        return new Product();

    }

    @GetMapping()
    public List<Product> getAllProducts(){}{

        List<Product> products = new ArrayList<Product>();
    }

    @PostMapping()
    public Product createProduct(){
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long productId){

    }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable("id") Long productId, @RequestBody Product product){

    }

    @PatchMapping("/{id}")
    public void replaceProduct(@PathVariable("id") Long productId, @RequestBody Product product){

    }
}
