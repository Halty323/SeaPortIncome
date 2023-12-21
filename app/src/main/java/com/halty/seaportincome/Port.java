package com.halty.seaportincome;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Port {
    private final List<Income> incomes;
    private int totalIncome;

    public Port(Income... incomes) {
        this.incomes = Arrays.stream(incomes).collect(Collectors.toList());
        updateTotalIncome();
    }

    private void updateTotalIncome() {
        totalIncome = 0;
        for (Income income : incomes) {
            totalIncome += income.getMonthlyIncome();
        }
    }
    // на всякий случай если в будущем придется добавлять доходы к порту
    public void addIncome(Income income) {
        incomes.add(income);
        updateTotalIncome();
    }
    public List<Income> getIncomes() {
        return incomes;
    }
    public int getTotalIncome() {
        return totalIncome;
    }
}
