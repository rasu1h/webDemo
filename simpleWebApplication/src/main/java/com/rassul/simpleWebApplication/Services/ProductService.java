package com.rassul.simpleWebApplication.Services;

import com.rassul.simpleWebApplication.Models.Product;
import com.rassul.simpleWebApplication.Repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProduct(){
        return repo.findAll();
    }


    public Product gerProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
     repo.save(prod);
    }

    public void deleteProduct(int prodId){
      repo.deleteById(prodId);
    }
}
