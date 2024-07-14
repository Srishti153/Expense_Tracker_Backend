package com.Project.ExpenseTracker.services.stats;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.Project.ExpenseTracker.dto.GraphDTO;
import com.Project.ExpenseTracker.repository.ExpenseRepository;
import com.Project.ExpenseTracker.repository.IncomeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StatsServiceImplementation implements StatsService{
    
    private final IncomeRepository incomeRepository;
    private final ExpenseRepository expenseRepository;

    public GraphDTO getChartData(){
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = endDate.minusDays(27);

        GraphDTO graphDTO = new GraphDTO();
        graphDTO.setExpenseList(expenseRepository.findByDateBetween(startDate, endDate));
        graphDTO.setIncomeList(incomeRepository.findByDateBetween(startDate, endDate));

        return graphDTO;
    }
}
