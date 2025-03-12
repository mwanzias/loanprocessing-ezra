package com.mwanzias.lending.loanproduct.controller;

import com.mwanzias.lending.loanproduct.entity.LoanProduct;
import com.mwanzias.lending.loanproduct.repository.LoanProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoanProductController {

    // adding observeability for the application in order to be able to troubleshoot
    private static final Logger logger = LoggerFactory.getLogger(LoanProductController.class);

   @PostMapping("/loanproducts")
   public ResponseEntity<LoanProduct> create(@RequestBody LoanProduct loanProduct) {
    return null;
   }

    @GetMapping("/{id}")
    public LoanProduct findById(@PathVariable  Long id) {
        return null;
    }

}
