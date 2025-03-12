package com.mwanzias.lending.loanmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class LoanData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // This would be changed in the future to have it with some specific structure, have a service function that generated IDs
    private long loanId;
    @NotBlank(message = "The loan cannot be blank")
    @Min(value = 50, message="The loan cannot be less than 50")
    @Max(value = 100000, message = "The loan amount cannot be greater than 100000")
    private long loanAmount;
    @NotBlank(message = "The loan must have a correlating loan product ID")
    private long loanProductId;
    private LocalDateTime loanRequestDate;
    private LocalDateTime loanDueDate;

    public LoanData() {
    }

    @NotBlank(message = "The national Id is required ")
    @Size(min = 5, max=9, message = "The national ID does not seem to be valid")
    private String customerNationalId;

    public LocalDateTime getLoanDueDate() {
        return loanDueDate;
    }

    public void setLoanDueDate(LocalDateTime loanDueDate) {
        this.loanDueDate = loanDueDate;
    }

    public LocalDateTime getLoanRequestDate() {
        return loanRequestDate;
    }

    public void setLoanRequestDate(LocalDateTime loanRequestDate) {
        this.loanRequestDate = loanRequestDate;
    }

    public long getLoanProductId() {
        return loanProductId;
    }

    public void setLoanProductId(long loanProductId) {
        this.loanProductId = loanProductId;
    }

    public long getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(long loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getCustomerNationalId() {
        return customerNationalId;
    }

    public void setCustomerNationalId(String customerNationalId) {
        this.customerNationalId = customerNationalId;
    }

    public long getLoanId() {
        return loanId;
    }

    @PrePersist
    protected void onCreate() { // give the loanreuestDate a date of today
        this.loanRequestDate = LocalDateTime.now();
    }
}
