package com.mwanzias.lending.loanproduct.model;

import java.util.ArrayList;
import java.util.List;

public class LoanProduct {
    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public LoanProduct() {
    }

    public LoanProduct(int feeApplicationDate, List<ProductFees> productFees, String productName) {
        this.feeApplicationDate = feeApplicationDate;
        this.productFees = productFees;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "LoanProduct{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productFees=" + productFees +
                ", feeApplicationDate=" + feeApplicationDate +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<ProductFees> getProductFees() {
        return productFees;
    }

    public void setProductFees(List<ProductFees> productFees) {
        this.productFees = productFees;
    }

    public int getFeeApplicationDate() {
        return feeApplicationDate;
    }

    public void setFeeApplicationDate(int feeApplicationDate) {
        this.feeApplicationDate = feeApplicationDate;
    }

    private long productId;
    private String productName;
    private List<ProductFees> productFees = new ArrayList<>();
    private int feeApplicationDate;

}
