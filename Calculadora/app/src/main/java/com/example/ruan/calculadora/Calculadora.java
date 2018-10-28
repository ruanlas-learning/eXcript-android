package com.example.ruan.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculadora extends AppCompatActivity {

    private EditText edNum1, edNum2, edSoma;
    private Button btSoma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);

        edNum1 = (EditText) findViewById(R.id.edNum1);
        edNum2 = (EditText) findViewById(R.id.edNum2);
        edSoma = (EditText) findViewById(R.id.edSoma);
        btSoma = (Button) findViewById(R.id.btSoma);

    }

    public void facaASoma(View view){
        int x, y;
        x = Integer.valueOf(edNum1.getText().toString());
        y = Integer.valueOf(edNum2.getText().toString());

        int soma = x + y;

        edSoma.setText(String.valueOf(soma));
    }
}
