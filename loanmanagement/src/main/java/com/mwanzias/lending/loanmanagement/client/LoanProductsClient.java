package com.mwanzias.lending.loanmanagement.client;

import com.mwanzias.lending.loanproduct.entity.LoanProduct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

@HttpExchange
public interface LoanProductsClient {
    @PostExchange("/products/loanproducts")
    LoanProduct saveLoanProduct(@RequestBody LoanProduct loanProduct);

    @GetExchange("/products/loanproducts")
    List<LoanProduct> getLoanProducts();

    @GetExchange("/products/loanproducts/{id}")
    LoanProduct fetchLoanProductByProductID(@PathVariable("id")   Long id);
}
