package com.example.ruan.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToastExample extends AppCompatActivity {

    private Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        btnToast = (Button)findViewById(R.id.btToast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // o método v.getContext() obtém a referência do contexto/Activity que está chamando este evento
                Toast toast = Toast.makeText(v.getContext(), "Toast é muito simples", Toast.LENGTH_LONG);
                toast.show();
            }
        });
//        Toast toast = Toast.makeText(this, "Toast é muito simples", Toast.LENGTH_LONG);
//        toast.show();

    }
}
