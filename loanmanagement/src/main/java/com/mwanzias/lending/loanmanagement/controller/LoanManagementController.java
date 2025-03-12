package com.mwanzias.lending.loanmanagement.controller;

import com.mwanzias.lending.loanmanagement.client.KycDataClient;
import com.mwanzias.lending.loanmanagement.client.LoanProductsClient;
import com.mwanzias.lending.loanmanagement.entity.LoanData;
import com.mwanzias.lending.loanmanagement.repository.LoanManagerServiceRespository;
import com.mwanzias.lending.loanmanagement.service.LoanManagerService;
import com.mwanzias.lending.loanproduct.entity.LoanProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoanManagementController {

    @Autowired
    private LoanManagerService loanManagerService;

    @Autowired
    private KycDataClient kycDataClient;

    @Autowired
    private LoanProductsClient loanProductsClient;

    @GetMapping("/company/active-loans")
    public List<LoanData> getActiveLoans() {
        return loanManagerService.getAllCustomerLoans();
    }

    @GetMapping("/company/active-loans/nationalid/{nationalid}")
    public List<LoanData> getCutomerActiveLoans(@PathVariable("nationalid") String nationalid) {
        return loanManagerService.getCustomerActiveLoans(nationalid);
    }

    @GetMapping("/company/active-loans/loanid/{loanid}")
    public LoanData getCutomerActiveLoans(@PathVariable("loanid") long loanid) {
        return loanManagerService.getLoansByLoanId(loanid);
    }


    @PostMapping("customer/loan-request")
    public LoanData createLoan(@RequestBody LoanData loanData) {
       return loanManagerService.saveCustomerLoan(loanData);
    }


}
