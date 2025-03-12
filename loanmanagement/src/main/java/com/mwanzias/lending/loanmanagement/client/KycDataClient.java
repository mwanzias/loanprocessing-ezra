package com.mwanzias.lending.loanmanagement.client;

import com.mwanzias.lending.kycservice.entity.KycData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.HttpExchange;

//This will enable us to communicate witht he KYC data service internally
@HttpExchange
public interface KycDataClient {

    @GetMapping("kycinformation/kycdata/phonenumber/{phonenumber}")
    public KycData findAllByPhoneNumber(@PathVariable("phonenumber") String customerPhone);

}
