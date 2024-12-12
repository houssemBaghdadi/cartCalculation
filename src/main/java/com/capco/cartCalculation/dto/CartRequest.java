package com.capco.cartCalculation.dto;

import com.capco.cartCalculation.model.Customer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartRequest {
    private Customer customer;
    private Cart cart;
}
