package com.mwanzias.lending.loanproduct.service;

import com.mwanzias.lending.loanproduct.entity.LoanProduct;
import com.mwanzias.lending.loanproduct.repository.LoanProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanProductServiceImpl implements LoanProductService {

    @Autowired
    private LoanProductRepository loanProductRepository;

    @Override
    public LoanProduct saveLoanProduct(LoanProduct loanProduct) {
        return loanProductRepository.save(loanProduct);
    }

    @Override
    public List<LoanProduct> getAllLoanProducts() {
        return loanProductRepository.findAll();
    }

    @Override
    public LoanProduct getAllLoanProductById(Long id) {
        return loanProductRepository.findById(id).get();
    }

}
