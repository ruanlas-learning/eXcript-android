package com.example.ruan.activityviewelogcat;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

//public class Main extends AppCompatActivity {
public class Main extends Activity {

    @Override
    protected void onCreate(Bundle save) {
        super.onCreate(save);
        //"linka" o XML com a classe da Activity
        //Chama o arquivo XML nesta classe Main
        //XML => Extensible Markup Language
        setContentView(R.layout.main);
    }

    public static void cliquei(View v){
        //A classe 'Log' Envia a mensagem ao LogCat
        //Cada método 'i,d,e ...' imprime no LogCat com uma cor diferente (ou pelo menos deveria kkkkk)
        //O LogCat é o log do android
        //O LogCat serve para imprimir uma informação
        Log.i("Olá", "Eu passei por aqui");
        Log.d("Olá", "Eu passei por aqui");
        Log.e("Olá", "Eu passei por aqui");
        Log.w("Olá", "Eu passei por aqui");
    }
}
