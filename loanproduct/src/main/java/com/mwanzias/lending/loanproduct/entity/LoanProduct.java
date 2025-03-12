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
    private Long interestType ; //fixed or flexible calculations like daily rate monthly rate
    private Long interestRate;
    private Long lateFeeRate;
    private String lateFeeRateCalcType; // percentage or lump on the cycle.
    private String interestCalcType; // percentage or lump on the cycle.
    private int lateFeeApplicationGracePeriod;
    private long loanPeriod;
    private String loanPeriodType;  //months or days



}
