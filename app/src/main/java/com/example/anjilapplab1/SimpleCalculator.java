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

public class SimpleCalculator extends AppCompatActivity {

    TextView res;
    EditText number1,number2;
    Button multiply,divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_simple_calculator);
        number1 = findViewById(R.id.num1);
        number2 = findViewById(R.id.num2);
        multiply = findViewById(R.id.btnmultiply);
        divide = findViewById(R.id.btnDivide);
        res = findViewById(R.id.result);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(number1.getText().toString());
                int n2 = Integer.parseInt(number2.getText().toString());
                int mul = n1 * n2;
                res.setText("Multiplication of two number=" + mul);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int n1 = Integer.parseInt(number1.getText().toString());
                    int n2 = Integer.parseInt(number2.getText().toString());
                    int div = n1 / n2;
                    res.setText("Division of two number=" + div);
                }catch (Exception e){
                    res.setText(e.getMessage());
                }
            }
        });
    }
}