package com.halty.seaportincome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.halty.seaportincome.IncomeTypes.ConstantIncome;
import com.halty.seaportincome.IncomeTypes.RelativeIncome;

public class MainActivity extends AppCompatActivity {

    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = findViewById(R.id.resultText);
        analyze();
    }

    private void analyze() {
        ConstantIncome rent = new ConstantIncome("Аренда площадей порта", 1, 170000);
        RelativeIncome shipService = new RelativeIncome("Обслуживание морских судов", 2, 3500, 125);
        Port port = new Port(rent, shipService);

        for (Income income : port.getIncomes()) {
            resultText.append(String.format("%d: %s заработал:\n%s монет для порта\n", income.getId(), income.getName(), income.getMonthlyIncome()));
        }
        resultText.append(String.format("Всего заработано: %d монет", port.getTotalIncome()));
    }
}