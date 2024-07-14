package com.Project.ExpenseTracker.dto;

import java.util.List;

import com.Project.ExpenseTracker.entity.Expense;
import com.Project.ExpenseTracker.entity.Income;

import lombok.Data;

@Data
public class GraphDTO {
    
    private List<Expense> expenseList;
    private List<Income> incomeList;
}
