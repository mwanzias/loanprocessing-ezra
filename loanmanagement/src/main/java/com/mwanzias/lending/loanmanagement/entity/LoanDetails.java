package com.mwanzias.lending.loanmanagement.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class LoanDetails {

    private long loanId;
    private String loanType;
    private LocalDateTime loanRequestDate;
    private LocalDateTime loanDueDate;

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    private BigDecimal loanAmount;
    private BigDecimal loanInterest;
    private BigDecimal loanBalancce;


    public LoanDetails() {
    }
    public long getLoanId() {
        return loanId;
    }
    public void setLoanId(long loanId) {}

    public LocalDateTime getLoanRequestDate() {
        return loanRequestDate;
    }

    public void setLoanRequestDate(LocalDateTime loanRequestDate) {
        this.loanRequestDate = loanRequestDate;
    }

    public LocalDateTime getLoanDueDate() {
        return loanDueDate;
    }

    public void setLoanDueDate(LocalDateTime loanDueDate) {
        this.loanDueDate = loanDueDate;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getLoanInterest() {
        return loanInterest;
    }

    public void setLoanInterest(BigDecimal loanInterest) {
        this.loanInterest = loanInterest;
    }

    public BigDecimal getLoanBalancce() {
        return loanBalancce;
    }

    public void setLoanBalancce(BigDecimal loanBalancce) {
        this.loanBalancce = loanBalancce;
    }
}
