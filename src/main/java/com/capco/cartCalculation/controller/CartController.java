package com.capco.cartCalculation.controller;

import com.capco.cartCalculation.dto.CartRequest;
import com.capco.cartCalculation.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/calculate")
    public double calculate(@RequestBody CartRequest request) {
        return cartService.calculateCost(request.getCustomer(), request.getCart());
    }
}
