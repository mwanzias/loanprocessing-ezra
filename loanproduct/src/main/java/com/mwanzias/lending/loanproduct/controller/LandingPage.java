package com.mwanzias.lending.loanproduct.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingPage {

    @GetMapping("/")
     public String LandingPage() {
        return "Welcome to the Loan product API interface";
    }
}
