package com.example.anjilapplab1;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class form2 extends AppCompatActivity implements View.OnClickListener {

    CheckBox c1,c2,c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form2);
        c1 = findViewById(R.id.chk1);
        c2 = findViewById(R.id.chk2);
        c3 = findViewById(R.id.chk3);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        c1.setChecked(false);
        c2.setChecked(false);
        c3.setChecked(false);
        CheckBox clickedCheckBox = (CheckBox) v;
        clickedCheckBox.setChecked(true);
        Toast.makeText(getApplicationContext(),clickedCheckBox.getText()+"is checked",Toast.LENGTH_LONG).show();
    }
}