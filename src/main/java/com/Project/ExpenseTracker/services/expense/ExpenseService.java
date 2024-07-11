package com.Project.ExpenseTracker.services.expense;


import com.Project.ExpenseTracker.dto.ExpenseDTO;
import com.Project.ExpenseTracker.entity.Expense;

import java.util.List;

public interface ExpenseService {
    Expense postExpense(ExpenseDTO expenseDTO);
    List<Expense> getAllExpenses();
    Expense getExpenseById(Long id);
    Expense updatExpense(Long id, ExpenseDTO expenseDTO);
    void deleteExpense(Long id);
}
