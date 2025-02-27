package com.example.anjilapplab1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PersonalInformation extends AppCompatActivity {

    EditText t1,t2;
    Spinner s1,s2;

    CheckBox c1,c2,c3;

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_personal_information);

        t1=findViewById(R.id.txtname);
        t2=findViewById(R.id.txtaddress);
        s1=findViewById(R.id.spngender);
        String[] farray1= new String[]{"Male","Female","Others"};
        ArrayAdapter<String> adapter1;
        adapter1 = new ArrayAdapter<>(getApplicationContext(),androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,farray1);
        s1.setAdapter(adapter1);

        s2=findViewById(R.id.spnCountry);
        String[] farray2= new String[]{"Nepal","India","China"};
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(getApplicationContext(),androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,farray2);
        s2.setAdapter(adapter);
        c1 = findViewById(R.id.chk1);
        c2 = findViewById(R.id.chk2);
        c3 = findViewById(R.id.chk3);

        b1=findViewById(R.id.btnSubmit);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String  name=t1.getText().toString();
               String address=t2.getText().toString();
               String gender = s1.getSelectedItem().toString();
               String country = s2.getSelectedItem().toString();
               String h1 = "";
               String h2="";
               String h3="";
                if (c1.isChecked())
                    h1=c1.getText().toString();
                if (c2.isChecked())
                    h2=c2.getText().toString();
                if (c3.isChecked())
                    h3=c1.getText().toString();
                String message = "Name: " + name + "\nAddress: " + address +
                        "\nGender: " + gender + "\nCountry: " + country +
                        "\nHobbies: "+h1 + h2 + h3 +"\n";

                Toast.makeText(PersonalInformation.this, message, Toast.LENGTH_LONG).show();

            }
        });
    }
}