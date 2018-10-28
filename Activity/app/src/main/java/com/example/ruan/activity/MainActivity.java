package com.example.ruan.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*
*   Ao utilizar um aplicativo, quando acontece algum evento externo, como uma ligação, por exemplo,
* o android irá sobrepor a tela do aplicativo com a tela da ligação, destruindo a tela da aplicação.
* Ao terminar a ligação, o android chama novamente a tela do aplicativo, e devemos posicionar o
* usuário na tarefa que ele estava realizando antes da ligação, sem perder nenhuma informação.
*
* */

//public class MainActivity extends AppCompatActivity {
public class MainActivity extends Activity {

    private Button btnTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTela2 = (Button)findViewById(R.id.btnTela2);
        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(v.getContext(), Tela2.class);
                startActivity(i);
            }
        });
    }
}
