package com.mwanzias.lending.kycservice.service;

import com.mwanzias.lending.kycservice.entity.KycData;

import java.util.List;
import java.util.Optional;

public interface KycDataService {
    KycData SaveCustomerData(KycData kycData);
    List<KycData> fetchAllCustomerData();
    KycData findCustomerByPhoneNumber(String phoneNumber);
    KycData findCustomerByNationalId(String nationalId);
    KycData findCustomerByEmailAddress(String emailAddress);
    KycData findByCustomerPhoneAndCustomerEmail(String phoneNumber, String emailAddress);
    Optional<KycData> updateLoanLimit(String phoneNumber, String emailAddress, long loanLimit);
}
