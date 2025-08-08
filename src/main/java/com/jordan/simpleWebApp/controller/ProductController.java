package com.jordan.simpleWebApp.controller;

import com.jordan.simpleWebApp.model.Product;
import com.jordan.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    ProductService productService;



    @GetMapping("/products")
    public List<Product> getProducts(){
       return productService.getProduct();
    }

    @GetMapping("/products/{productID}")
    public Product getProductById(@PathVariable int productID){
        return productService.getProductById(productID);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        System.out.println(product);
        productService.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }

    @DeleteMapping("/products/{productID}")
    public void deleteProduct(@PathVariable int productID){
        System.out.println("Inside Delete Mapping");
        productService.deleteProduct(productID);

    }


}
