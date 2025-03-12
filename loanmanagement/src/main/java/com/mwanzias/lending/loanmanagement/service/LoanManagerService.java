package com.mwanzias.lending.loanmanagement.service;

import com.mwanzias.lending.loanmanagement.entity.LoanData;

import java.util.List;

public interface LoanManagerService {
    LoanData saveCustomerLoan(LoanData loanData);

    List<LoanData> getAllCustomerLoans();

    List<LoanData> getCustomerActiveLoans(String nationalid);

    LoanData getLoansByLoanId(long loanid);
}
