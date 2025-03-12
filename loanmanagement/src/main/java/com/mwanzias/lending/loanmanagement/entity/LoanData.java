package com.mwanzias.lending.loanmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class LoanData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // This would be changed in the future to have it with some specific structure, have a service function that generated IDs
    private long loanId;
    @NotBlank(message = "The national Id is required ")
    @Size(min = 5, max=9, message = "The national ID does not seem to be valid")
    private String customerNationalId;
    private long loanAmount;
    private long loanProductId;
    private Date loanRequestDate;
}
