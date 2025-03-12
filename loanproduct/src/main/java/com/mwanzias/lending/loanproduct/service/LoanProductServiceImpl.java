package com.mwanzias.lending.loanproduct.service;

import com.mwanzias.lending.loanproduct.entity.LoanProduct;
import com.mwanzias.lending.loanproduct.repository.LoanProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class LoanProductServiceImpl implements LoanProductService {

    @Autowired
    private LoanProductRepository loanProductRepository;

    @Override
    public LoanProduct saveLoanProduct(LoanProduct loanProduct) {
        return loanProductRepository.save(loanProduct);
    }
}
