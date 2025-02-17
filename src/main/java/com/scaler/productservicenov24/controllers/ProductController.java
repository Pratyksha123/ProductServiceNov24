package com.scaler.productservicenov24.controllers;

import com.scaler.productservicenov24.models.Product;
import com.scaler.productservicenov24.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {


    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{productId}")
    public Product getSingleProduct(@PathVariable("productId") Long productId){

        Product product = productService.getProductById(productId);
        return product;

    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){

        return productService.getAllProducts();
    }

    @PostMapping()
    public Product createProduct(@RequestBody Product product){
        return null;
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable("productId") Long productId){

    }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable("id") Long productId, @RequestBody Product product){

    }

    @PatchMapping("/{id}")
    public void replaceProduct(@PathVariable("id") Long productId, @RequestBody Product product){

    }
}
