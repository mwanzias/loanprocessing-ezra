package com.mwanzias.lending.loanproduct.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class LoanProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;
    private String productName;
    private InterestType interestType ; //fixed or flexible calculations like daily rate monthly rate
    private Long interestRate;
    private Long lateFeeRate;
    private RateCalcType lateFeeRateCalcType; // percentage or lump on the cycle.
    private RateCalcType interestCalcType; // percentage or lump on the cycle.
    private int lateFeeApplicationGracePeriod;
    private long loanPeriod;
    private PeriodType loanPeriodType;  //months or days


    public LoanProduct() {
    }

    public String getProductName() {
        return productName;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public InterestType getInterestType() {
        return interestType;
    }

    public void setInterestType(InterestType interestType) {
        this.interestType = interestType;
    }

    public Long getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Long interestRate) {
        this.interestRate = interestRate;
    }

    public Long getLateFeeRate() {
        return lateFeeRate;
    }

    public void setLateFeeRate(Long lateFeeRate) {
        this.lateFeeRate = lateFeeRate;
    }

    public RateCalcType getLateFeeRateCalcType() {
        return lateFeeRateCalcType;
    }

    public void setLateFeeRateCalcType(RateCalcType lateFeeRateCalcType) {
        this.lateFeeRateCalcType = lateFeeRateCalcType;
    }

    public RateCalcType getInterestCalcType() {
        return interestCalcType;
    }

    public void setInterestCalcType(RateCalcType interestCalcType) {
        this.interestCalcType = interestCalcType;
    }

    public int getLateFeeApplicationGracePeriod() {
        return lateFeeApplicationGracePeriod;
    }

    public void setLateFeeApplicationGracePeriod(int lateFeeApplicationGracePeriod) {
        this.lateFeeApplicationGracePeriod = lateFeeApplicationGracePeriod;
    }

    public long getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(long loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public PeriodType getLoanPeriodType() {
        return loanPeriodType;
    }

    public void setLoanPeriodType(PeriodType loanPeriodType) {
        this.loanPeriodType = loanPeriodType;
    }
}
