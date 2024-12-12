package com.capco.cartCalculation.service;

import com.capco.cartCalculation.dto.Cart;
import com.capco.cartCalculation.model.BusinessCustomer;
import com.capco.cartCalculation.model.Customer;
import com.capco.cartCalculation.model.IndividualCustomer;
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
        if (customer instanceof IndividualCustomer) {
            return individualPrice(product);
        } else if (customer instanceof BusinessCustomer) {
            BusinessCustomer business = (BusinessCustomer) customer;
            return businessPrice(product, business.getAnnualRevenue());
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

    private double businessPrice(Product product, double annualRevenue) {
        if (annualRevenue > 10_000_000) {
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
