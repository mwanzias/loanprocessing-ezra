package com.mwanzias.lending.loanmanagement.client;

import com.mwanzias.lending.loanmanagement.entity.KycData;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

//This will enable us to communicate witht he KYC data service internally
@HttpExchange
public interface KycDataClient {

    @GetExchange("kycinformation/kycdata/phonenumber/{phonenumber}")
    KycData findAllByPhoneNumber(@PathVariable("phonenumber") String customerPhone);

    @GetExchange("kycinformation/kycdata/nationalid/{nationalid}")
    KycData findAllByCustomerNationalId(@PathVariable("nationalid") String nationalId);
}

