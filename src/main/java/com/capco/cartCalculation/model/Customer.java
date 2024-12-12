package com.capco.cartCalculation.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private String id;
    private String type; // "Individual" or "Business"
    private String lastName;
    private String firstName;
    private String companyName;
    private String vatNumber;
    private String siren;
    private Double annualRevenue;

    public Customer(String id, String type) {
        this.id = id;
        this.type = type;
    }
}

