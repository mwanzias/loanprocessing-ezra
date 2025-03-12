package com.mwanzias.lending.kycservice.service;

import com.mwanzias.lending.kycservice.entity.KycData;
import com.mwanzias.lending.kycservice.repository.KycDataServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KycDataServiceImpl  implements KycDataService {

    @Autowired
    private KycDataServiceRepository kycDataServiceRepository;

    @Override
    public KycData SaveCustomerData(KycData kycData) {
        return kycDataServiceRepository.save(kycData);
    }

    @Override
    public List<KycData> fetchAllCustomerData() {
        return kycDataServiceRepository.findAll();
    }

    @Override
    public KycData findCustomerByPhoneNumber(String phoneNumber) {
           return kycDataServiceRepository.findByCustomerPhone(phoneNumber);
    }

    @Override
    public KycData findCustomerByNationalId(String nationalid) {
        return kycDataServiceRepository.findByCustomerNationalId(nationalid);
    }

    @Override
    public KycData findCustomerByEmailAddress(String emailaddress) {
        return kycDataServiceRepository.findByCustomerEmail(emailaddress);
    }

   @Override
    public KycData findByCustomerPhoneAndCustomerEmail(String phoneNumber, String emailAddress) {
        return kycDataServiceRepository.findByCustomerPhoneAndCustomerEmail(phoneNumber, emailAddress);
    }

    public Optional<KycData> updateLoanLimit(String phoneNumber, String emailAddress, long loanLimit) {
        KycData existingLoanRecord = kycDataServiceRepository.findByCustomerPhoneAndCustomerEmail(phoneNumber, emailAddress);
        
        if (existingLoanRecord!=null) {
            existingLoanRecord.setLoanLimit(loanLimit);  // Update the loanLimit
            kycDataServiceRepository.save(existingLoanRecord);  // Save changes
            return Optional.of(existingLoanRecord);
        }
        return Optional.empty();
    }

}
