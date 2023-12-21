package com.halty.seaportincome.IncomeTypes;

import com.halty.seaportincome.Income;

public class RelativeIncome extends Income {

    public RelativeIncome(String name, int id, int singularPrice, int amount) {
        this.name = name;
        this.id = id;
        updateMonthlyIncome(singularPrice, amount);
    }

    public void updateMonthlyIncome(int singularPrice, int amount) {
        monthlyIncome = singularPrice * amount;
    }
}
