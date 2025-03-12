package com.mwanzias.lending.loanproduct.service;

import com.mwanzias.lending.loanproduct.entity.LoanProduct;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface LoanProductService {
    LoanProduct saveLoanProduct(LoanProduct loanProduct);

    List<LoanProduct> getAllLoanProducts();

    LoanProduct getAllLoanProductById(Long id);
}
