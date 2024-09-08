package com.saturn.dancalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Add(View v){
        EditText et1=(EditText)findViewById(R.id.num1);
        EditText et2=(EditText)findViewById(R.id.num2);
        EditText et3=(EditText)findViewById(R.id.editTextNumber3);

        if (et1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter the 1st number", Toast.LENGTH_SHORT).show();
            return;
        }
        
        if (et2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter the second number", Toast.LENGTH_SHORT).show();
            return;
        }

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1+n2;

        et3.setText("Total  " + result);

    }

    public void Subtract(View v){
        EditText et1=(EditText)findViewById(R.id.num1);
        EditText et2=(EditText)findViewById(R.id.num2);
        EditText et3=(EditText)findViewById(R.id.editTextNumber3);

        if (et1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter the 1st number", Toast.LENGTH_SHORT).show();
            return;
        }

        if (et2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter the second number", Toast.LENGTH_SHORT).show();
            return;
        }

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1-n2;

        et3.setText("Total " + result);

    }

    public void Multiply(View v){
        EditText et1=(EditText)findViewById(R.id.num1);
        EditText et2=(EditText)findViewById(R.id.num2);
        EditText et3=(EditText)findViewById(R.id.editTextNumber3);

        if (et1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter the 1st number", Toast.LENGTH_SHORT).show();
            return;
        }

        if (et2.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter the 2nd number", Toast.LENGTH_SHORT).show();
            return;
        }

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1*n2;

        et3.setText("Total " + result);

    }

    public void Divide(View v){
        EditText et1=(EditText)findViewById(R.id.num1);
        EditText et2=(EditText)findViewById(R.id.num2);
        EditText et3=(EditText)findViewById(R.id.editTextNumber3);

        if (et1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter the 1st number", Toast.LENGTH_SHORT).show();
            return;
        }

        if (et2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter the second number", Toast.LENGTH_SHORT).show();
            return;
        }

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1/n2;

        et3.setText("Total " + result);

    }
}