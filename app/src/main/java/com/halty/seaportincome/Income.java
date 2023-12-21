package com.halty.seaportincome;

// мне кажется лучше было сделать интерфейс но пока не хочу в них лезть
public class Income {
    protected int monthlyIncome;
    protected String name;
    protected int id;

    public Income(String name, int id, int monthlyIncome){
        this.name = name;
        this.id = id;
        this.monthlyIncome = monthlyIncome;
    }

    public Income() {
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
