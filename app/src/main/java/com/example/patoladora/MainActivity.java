package com.example.patoladora;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText numUm, numDois;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(Color.rgb(187, 211, 136));
        result = findViewById(R.id.result);
        numUm = findViewById(R.id.numUm);
        numDois = findViewById(R.id.numDois);
    }
    public void somation(View v){
        int n1 = Integer.parseInt(numUm.getText().toString());
        int n2 = Integer.parseInt(numDois.getText().toString());
        int soma = n1+n2;

        result.setText(soma+" ");
    }
    public void subtation(View v){
        int n1 = Integer.parseInt(numUm.getText().toString());
        int n2 = Integer.parseInt(numDois.getText().toString());
        int sub = n1-n2;

        result.setText(sub+" ");
    }
    public void multiplication(View v) {
        int n1 = Integer.parseInt(numUm.getText().toString());
        int n2 = Integer.parseInt(numDois.getText().toString());
        int resultado = n1 * n2;

        result.setText(resultado);
    }

    public void divisation(View v) {
        int n1 = Integer.parseInt(numUm.getText().toString());
        int n2 = Integer.parseInt(numDois.getText().toString());
        int resultado = n1 / n2;

        result.setText(resultado+" ");
    }
}