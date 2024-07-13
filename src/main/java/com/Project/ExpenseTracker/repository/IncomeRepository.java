package com.Project.ExpenseTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.ExpenseTracker.entity.Income;


@Repository
public interface IncomeRepository extends JpaRepository<Income, Long>{
    
}