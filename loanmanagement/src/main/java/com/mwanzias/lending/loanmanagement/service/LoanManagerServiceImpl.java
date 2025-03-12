package com.mwanzias.lending.loanmanagement.service;

import com.mwanzias.lending.loanmanagement.entity.LoanData;
import com.mwanzias.lending.loanmanagement.repository.LoanManagerServiceRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanManagerServiceImpl  implements LoanManagerService {

    @Autowired
    private LoanManagerServiceRespository loanManagerServiceRespository;

    @Override
    public LoanData saveCustomerLoan(LoanData loanData) {
        return loanManagerServiceRespository.save(loanData);
    }

    @Override
    public List<LoanData> getAllCustomerLoans() {
        return loanManagerServiceRespository.findAll();
    }

    @Override
    public List<LoanData> getCustomerActiveLoans(String nationalid) {
        return loanManagerServiceRespository.findByCustomerNationalId(nationalid);
    }

    @Override
    public LoanData getLoansByLoanId(long loan_id) {
        return loanManagerServiceRespository.findById(loan_id).orElse(null);
    }
}
