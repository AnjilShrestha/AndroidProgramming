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

public class Rectangle extends AppCompatActivity {

    EditText t1,t2;
    TextView res;
    Button area, perimeter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rectangle);
        t1=findViewById(R.id.len);
        t2=findViewById(R.id.bre);
        res=findViewById(R.id.result);
        area=findViewById(R.id.btnArea);
        perimeter=findViewById(R.id.btnPerimeter);
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int l = Integer.parseInt(t1.getText().toString());
                int b = Integer.parseInt(t2.getText().toString());
                int a = l * b;
                res.setText("Area of Rectangle=" + a);
            }
        });
        perimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int l = Integer.parseInt(t1.getText().toString());
                int b = Integer.parseInt(t2.getText().toString());
                int p = 2*(l + b);
                res.setText("Perimeter of Rectangle=" + p);
            }
        });

    }
}