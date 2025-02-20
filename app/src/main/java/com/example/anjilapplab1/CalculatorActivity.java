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

public class CalculatorActivity extends AppCompatActivity {
EditText t1,t2;
Button b1;
TextView trs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator);
        t1=findViewById(R.id.num1);
        t2=findViewById(R.id.num2);
        b1=findViewById(R.id.btnadd);
        trs=findViewById(R.id.result);
        //anonymous
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1= Integer.parseInt(t1.getText().toString());
                int n2= Integer.parseInt(t2.getText().toString());
                int sum=n1+n2;
                trs.setText("Addition of two number="+sum);
            }
        });


    }
//    public void addFunction(View v){
//        int n1= Integer.parseInt(t1.getText().toString());
//        int n2= Integer.parseInt(t2.getText().toString());
//        int sum=n1+n2;
//        trs.setText("Addition of two number="+sum);
//    }

}