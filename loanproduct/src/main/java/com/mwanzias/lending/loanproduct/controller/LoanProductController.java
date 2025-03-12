package com.mwanzias.lending.loanproduct.controller;

import com.mwanzias.lending.loanproduct.entity.LoanProduct;
import com.mwanzias.lending.loanproduct.service.LoanProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoanProductController {

    // adding observeability for the application in order to be able to troubleshoot- this
    // will be used after finalising the logging infrastrature
    private static final Logger logger = LoggerFactory.getLogger(LoanProductController.class);

    @Autowired
    private LoanProductService loanProductService;

   @PostMapping("/loanproducts")
   public LoanProduct saveLoanProduct(@RequestBody LoanProduct loanProduct) {
    return loanProductService.saveLoanProduct(loanProduct);
   }

    @GetMapping("/loanproducts")
    public List<LoanProduct> getLoanProducts() {
        return loanProductService.getAllLoanProducts();
    }

    @GetMapping("/loanproducts/{id}")
    public LoanProduct fetchLoanProductByProductID(@PathVariable("id")   Long id) {
        logger.info("Fetching loan product by id: " + id);
        return loanProductService.getAllLoanProductById(id);
    }

}
