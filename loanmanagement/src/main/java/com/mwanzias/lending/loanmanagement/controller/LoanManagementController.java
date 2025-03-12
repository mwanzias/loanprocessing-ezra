package com.mwanzias.lending.loanmanagement.controller;

import com.mwanzias.lending.loanmanagement.client.KycDataClient;
import com.mwanzias.lending.loanmanagement.repository.LoanManagerServiceRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanManagementController {

    @Autowired
    private LoanManagerServiceRespository loanManagerServiceRespository;

    @Autowired
    private KycDataClient kycDataClient;



}
