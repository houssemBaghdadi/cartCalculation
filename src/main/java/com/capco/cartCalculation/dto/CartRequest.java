package com.capco.cartCalculation.dto;

import com.capco.cartCalculation.model.Customer;

public static class CartRequest {
    private Customer customer;
    private Cart cart;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
