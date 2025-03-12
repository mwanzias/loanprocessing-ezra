package com.mwanzias.lending.loanmanagement.client;


import com.mwanzias.lending.loanmanagement.entity.LoanDetails;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface LoanProductsClient {
    @GetExchange("/products/loanproducts/{id}")
    LoanDetails fetchLoanProductByProductID(@PathVariable("id")   Long id);
}
