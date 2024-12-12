package com.capco.cartCalculation.dto;

import com.capco.cartCalculation.model.Product;

import java.util.Map;

public class Cart {
    private Map<Product, Integer> products;

    public Cart(Map<Product, Integer> products) {
        this.products = products;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}

