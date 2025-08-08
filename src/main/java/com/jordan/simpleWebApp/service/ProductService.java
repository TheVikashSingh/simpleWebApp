package com.jordan.simpleWebApp.service;

import com.jordan.simpleWebApp.model.Product;
import com.jordan.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductService {


    @Autowired
    ProductRepo productRepo;

//    List<Product> products = new ArrayList<>();


//    public ProductService() {
//        products.add(new Product(1004, "Pencil", 5));
//        products.add(new Product(1005, "Eraser", 4));
//        products.add(new Product(1006, "Ruler", 12));
//        products.add(new Product(1007, "Marker", 25));
//        products.add(new Product(1008, "Stapler", 120));
//        products.add(new Product(1009, "Calculator", 250));
//        products.add(new Product(1010, "Glue Stick", 20));
//        products.add(new Product(1011, "Sharpener", 8));
//        products.add(new Product(1012, "Sticky Notes", 40));
//        products.add(new Product(1013, "Desk Organizer", 300));
//        products.add(new Product(1014, "Mouse", 600));
//        products.add(new Product(1015, "Laptop Stand", 950));
//        products.add(new Product(1016, "Phone Charger", 450));
//        products.add(new Product(1017, "USB Cable", 150));
//        products.add(new Product(1018, "Water Bottle", 100));
//        products.add(new Product(1019, "Whiteboard", 700));
//        products.add(new Product(1020, "Projector", 15000));
//        products.add(new Product(1021, "HDMI Cable", 200));
//        products.add(new Product(1022, "Table Lamp", 850));
//        products.add(new Product(1023, "Headphones", 1200));
//    }

    public List<Product> getProduct() {
        return productRepo.findAll();
    }


    public Product getProductById(int productID) {
        return productRepo.findById(productID).orElse(new Product());
//        int noOfItems = products.size();
//        Product productFind = new Product();
//        for (int i = 0; i < noOfItems; i++) {
//            int prodID = products.get(i).getProductID();
//            if (prodID == productID) {
//                productFind = products.get(i);
//                break;
//            }
//        }
//        return productFind;
    }

    public void addProduct(Product product){
        productRepo.save(product);
    }

    public void updateProduct(Product product) {
        productRepo.save(product);
//        int i=0;
//        for(Product productChecking : products){
//            if(productChecking.getProductID() == product.getProductID()){
//                products.remove(productChecking);
//                products.add(product);
//                break;
//            }
//            i++;
//        }
    }

    public void deleteProduct(int productID) {
        productRepo.deleteById(productID);
//        for(Product product : products){
//            if(product.getProductID() == productID){
//                System.out.println(product);
//                products.remove(product);
//                break;
//            }
//        }
    }
}


