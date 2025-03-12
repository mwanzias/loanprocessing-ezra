package com.mwanzias.lending.kycservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingPage {

    @GetMapping("/")
    public String InitialPage() {
        return "Loan processing KYC info";
    }

}
