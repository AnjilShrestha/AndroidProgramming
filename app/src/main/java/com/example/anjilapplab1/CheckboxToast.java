package com.example.anjilapplab1;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CheckboxToast extends AppCompatActivity implements View.OnClickListener {

    CheckBox c1,c2,c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_checkbox_toast);
        c1 = findViewById(R.id.chk1);
        c2 = findViewById(R.id.chk2);
        c3 = findViewById(R.id.chk3);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);

    }
    public void onClick(View v)
    {
        if(c1.isChecked())
            Toast.makeText(getApplicationContext(),"Java is checked",Toast.LENGTH_LONG).show();
        if(c2.isChecked())
            Toast.makeText(getApplicationContext(),"PHP is checked",Toast.LENGTH_LONG).show();
        if(c3.isChecked())
            Toast.makeText(getApplicationContext(),"Kotlin is checked",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}