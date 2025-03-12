package com.mwanzias.lending.kycservice.repository;

import com.mwanzias.lending.kycservice.entity.KycData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KycDataServiceRepository  extends JpaRepository<KycData, Long> {
    KycData findByCustomerNationalId(String nationalId);
    KycData findByCustomerEmail(String emailaddress);
    KycData findByCustomerPhone(String customerPhone);
    KycData findByCustomerPhoneAndCustomerEmail(String phoneNumber, String emailAddress);
}
