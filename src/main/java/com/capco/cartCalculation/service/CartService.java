package com.capco.cartCalculation.service;

import com.capco.cartCalculation.dto.Cart;
import com.capco.cartCalculation.model.Customer;
import com.capco.cartCalculation.model.Product;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    public double calculateCost(Customer customer, Cart cart) {
        double total = 0;
        for (var entry : cart.getProducts().entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            total += getUnitPrice(customer, product) * quantity;
        }
        return total;
    }

    private double getUnitPrice(Customer customer, Product product) {
        if ("Individual".equals(customer.getType())) {
            return individualPrice(product);
        } else if ("Business".equals(customer.getType())) {
            return businessPrice(product, customer.getAnnualRevenue());
        }
        throw new IllegalArgumentException("Unknown customer type");
    }

    private double individualPrice(Product product) {
        return switch (product) {
            case HIGH_END_PHONE -> 1500;
            case MID_RANGE_PHONE -> 800;
            case LAPTOP -> 1200;
        };
    }

    private double businessPrice(Product product, Double annualRevenue) {
        if (annualRevenue != null && annualRevenue > 10_000_000) {
            return switch (product) {
                case HIGH_END_PHONE -> 1000;
                case MID_RANGE_PHONE -> 550;
                case LAPTOP -> 900;
            };
        } else {
            return switch (product) {
                case HIGH_END_PHONE -> 1150;
                case MID_RANGE_PHONE -> 600;
                case LAPTOP -> 1000;
            };
        }
    }
}
