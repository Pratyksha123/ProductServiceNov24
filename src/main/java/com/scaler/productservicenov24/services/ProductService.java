package com.scaler.productservicenov24.services;

import com.scaler.productservicenov24.models.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(long id);

    List<Product> getAllProducts();

    Product createProduct(Product product);

    void deleteProduct(Long productId);

    void updateProduct(Long productId, Product product);  //partial update

    void replaceProduct(Long productId, Product product); //full update




}
