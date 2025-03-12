package com.mwanzias.lending.loanmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

public class KycData {

    private Long customerId;
    private String customerName;
    private String customerEmail;
    private String customerNationalId;
    private String customerPhone;
    private Long loanLimit;


    public KycData(Long loanLimit, String customerPhone, String customerNationalId, String customerEmail, String customerName, Long customerId) {
        this.loanLimit = loanLimit;
        this.customerPhone = customerPhone;
        this.customerNationalId = customerNationalId;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public KycData() {
    }
}
