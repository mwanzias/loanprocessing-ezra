package com.mwanzias.lending.loanproduct.controller;

import com.mwanzias.lending.loanproduct.model.LoanProduct;
import com.mwanzias.lending.loanproduct.repository.LoanProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loanproducts")
public class LoanProductController {

    private static final Logger logger = LoggerFactory.getLogger(LoanProductController.class);

    @Autowired
    private LoanProductRepository repository;

    @PostMapping
    public LoanProduct add(@RequestBody LoanProduct loanProduct) {
        return loanProduct;
    }

    @GetMapping
    public List<LoanProduct> findAllProducts() {
        return null; // add body when the repository is populated
    }

    @GetMapping("/{id}")
    public LoanProduct findById(@PathVariable  Long id) {
        return null;
    }

}
