package com.scaler.productservicenov24.services;

import com.scaler.productservicenov24.dtos.FakeStoreProductDto;
import com.scaler.productservicenov24.models.Category;
import com.scaler.productservicenov24.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {

    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProductById(long id) {

        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject(
                "https://fakestoreapi.com/products/" + id,
                FakeStoreProductDto.class);

        //convert fakestore dto object into product object
        return convertFakeStoreProductDToProduct(fakeStoreProductDto);
    }

    @Override
    public List<Product> getAllProducts() {

            //Type Erasure
            FakeStoreProductDto[] fakeStoreProductDtos = restTemplate.getForObject(
                    "https://fakestoreapi.com/products",
                    FakeStoreProductDto[].class
            );

            List<Product> products = new ArrayList<>();
            for (FakeStoreProductDto fakeStoreProductDto : fakeStoreProductDtos) {
                products.add(convertFakeStoreProductDToProduct(fakeStoreProductDto));
            }

            return products;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long productId) {

    }

    @Override
    public void updateProduct(Long productId, Product product) {

    }

    @Override
    public void replaceProduct(Long productId, Product product) {

    }

    private  Product convertFakeStoreProductDToProduct(FakeStoreProductDto dto){

        Product product = new Product();
        product.setCategory(new Category());
        product.setTitle(dto.getName());
        product.setPrice(dto.getPrice());
        product.setDescription(dto.getDescription());
        product.setImage(dto.getImage());
        product.setId(dto.getId());
        product.getCategory().setValue(dto.getCategory());

        return product;
    }
}
