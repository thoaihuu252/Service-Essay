package com.ecomm.nhom4.Service.Service.Imp;

import com.ecomm.nhom4.Service.Entity.Product;
import com.ecomm.nhom4.Service.Repository.ProductRepository;
import com.ecomm.nhom4.Service.Service.Interface.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductRepository productReposity;
    @Override
    public Product saveProduct(Product product) {
        return productReposity.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productReposity.findAll();
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productReposity.findById(id);
    }

    @Override
    public void deleteProduct(Long id) {
        productReposity.deleteById(id);
    }

}
