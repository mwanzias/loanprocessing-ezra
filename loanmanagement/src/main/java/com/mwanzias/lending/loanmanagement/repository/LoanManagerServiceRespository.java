package com.mwanzias.lending.loanmanagement.repository;

import com.mwanzias.lending.loanmanagement.entity.LoanData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanManagerServiceRespository extends JpaRepository<LoanData, Long> {
}
