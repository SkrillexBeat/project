package com.example.dao;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 1000.0));
        products.add(new Product(2, "Smartphone", 500.0));
        return products;
    }
}
