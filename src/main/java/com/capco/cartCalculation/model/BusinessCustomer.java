package com.capco.cartCalculation.model;

public class BusinessCustomer extends Customer {
    private String companyName;
    private String vatNumber;
    private String siren;
    private double annualRevenue;

    public BusinessCustomer(String id, String companyName, String vatNumber, String siren, double annualRevenue) {
        super(id);
        this.companyName = companyName;
        this.vatNumber = vatNumber;
        this.siren = siren;
        this.annualRevenue = annualRevenue;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public String getSiren() {
        return siren;
    }

    public double getAnnualRevenue() {
        return annualRevenue;
    }
}