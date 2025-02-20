package com.example.anjilapplab1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InterestCalculation extends AppCompatActivity {

    EditText t1,t2,t3;
    Button b1;
    TextView res_si,res_ci;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_interest_calculation);
        t1=findViewById(R.id.principal);
        t2=findViewById(R.id.time);
        t3=findViewById(R.id.rate);
        b1=findViewById(R.id.btnCalculate);
        res_si=findViewById(R.id.si);
        res_ci=findViewById(R.id.ci);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float p=Float.parseFloat(t1.getText().toString());
                float t=Float.parseFloat(t2.getText().toString());
                float r=Float.parseFloat(t3.getText().toString());
                float si=(p*t*r)/100;
                double ci = p * Math.pow(1 + (r / 100), t) - p;
                res_si.setText("Simple Interest="+si);
                res_ci.setText("Compound Interest= "+ci);
            }
        });
    }
}