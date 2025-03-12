package com.mwanzias.lending.loanproduct.repository;

import com.mwanzias.lending.loanproduct.entity.LoanProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanProductRepository  extends JpaRepository<LoanProduct, Long> {
}
