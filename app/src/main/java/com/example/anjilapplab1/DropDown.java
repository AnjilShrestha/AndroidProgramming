package com.example.anjilapplab1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DropDown extends AppCompatActivity {

    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_drop_down);
        sp=findViewById(R.id.spnfaculty);
        String[] farray= new String[]{"BCA","BBA","CSIT"};
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(getApplicationContext(),androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,farray);
        sp.setAdapter(adapter);
    }
}