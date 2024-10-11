package com.rassul.simpleWebApplication.Controllers;

import com.rassul.simpleWebApplication.Models.Product;
import com.rassul.simpleWebApplication.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class    ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProduct();
    }
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.gerProductById(prodId);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }



}
