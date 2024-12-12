package com.capco.cartCalculation.model;

public abstract class Customer {
    private String id;

    public Customer(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}