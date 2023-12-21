package com.halty.seaportincome.IncomeTypes;

import com.halty.seaportincome.Income;

public class ConstantIncome extends Income {
    public ConstantIncome(String name, int id, int monthlyIncome) {
        super(name, id, monthlyIncome);
    }
    // на всякий случай если в будущем придется изменять доход
    public void setMonthlyIncome(int value) {
        monthlyIncome = value;
    }
}
