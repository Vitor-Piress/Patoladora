package com.example.patoladora;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText numUm, numDois;
    int n1, n2;

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
    public void valores(){
        try {
            n1 = Integer.parseInt(numUm.getText().toString());
            n2 = Integer.parseInt(numDois.getText().toString());
        }catch (Exception e){
            Toast.makeText(this, "Insira um valor para realizar as operações", Toast.LENGTH_SHORT).show();
        }
    }
    public void somation(View v){
        valores();
        int soma = n1+n2;

        result.setText(soma+" ");
    }
    public void subtation(View v){
        valores();
        int sub = n1-n2;

        result.setText(sub+" ");
    }
    public void multiplication(View v) {
        valores();
        int resultado = n1 * n2;

        result.setText(resultado+" ");
    }

    public void divisation(View v) {
        valores();
        int resultado = n1 / n2;

        result.setText(resultado+" ");
    }
}