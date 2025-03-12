package com.mwanzias.lending.kycservice.entity;

import jakarta.persistence.*;
import jakarta.validation.MessageInterpolator;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "kyc_data", uniqueConstraints = {
        @UniqueConstraint(columnNames = "customerEmail"),
        @UniqueConstraint(columnNames = "customerPhone"),
        @UniqueConstraint(columnNames = "customerNationalId")
})
public class KycData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    @NotNull
    @NotBlank(message = "Customer Name has to have a value")
    private String customerName;

    @NotBlank(message = "The email address is required")
    @Email(message = "Invalid email format")
    private String customerEmail;

    @NotBlank(message = "The National ID has to have a value")
    @Size(min = 5, max = 10, message = "The national ID must be between 5 and 10 characters")
    private String customerNationalId;

    @NotBlank(message = "The phone number of the customer is required")
    @Size(min = 10, max=13, message = "The phone number does not seem valid")
    private String customerPhone;

    //@NotNull(message = "The Loan limit for the customer is required")
    @Min(value = 50, message = "Loan limit must be greater than or equal to 50")
    private Long loanLimit;


    public String getCustomerNationalId() {
        return customerNationalId;
    }
    public void setCustomerNationalId(String customerNationalId) {
        this.customerNationalId = customerNationalId;
    }
    public Long getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Long loanLimit) {
        this.loanLimit = loanLimit;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

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
