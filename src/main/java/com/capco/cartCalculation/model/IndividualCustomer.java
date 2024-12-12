package com.capco.cartCalculation.model;

public class IndividualCustomer extends Customer {
    private String lastName;
    private String firstName;

    public IndividualCustomer(String id, String lastName, String firstName) {
        super(id);
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}