package com.capco.cartCalculation.dto;

import com.capco.cartCalculation.model.Product;
import lombok.Getter;

import java.util.Map;

@Getter
public class Cart {
    private Map<Product, Integer> products;

    public Cart(Map<Product, Integer> products) {
        this.products = products;
    }
}

