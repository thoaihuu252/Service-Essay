package com.ecomm.nhom4.Service.Service.Interface;

import com.ecomm.nhom4.Service.Entity.Product;

import java.util.List;
import java.util.Optional;


public interface ProductService {
    public Product saveProduct(Product product);
    public List<Product> getAllProduct();
    public Optional<Product> getProductById(Long id);
    public void deleteProduct(Long id);
}
