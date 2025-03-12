package com.mwanzias.lending.loanmanagement.repository;

import com.mwanzias.lending.loanmanagement.entity.LoanData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanManagerServiceRespository extends JpaRepository<LoanData, Long> {
    List<LoanData> findByCustomerNationalId(String nationalid);
}
