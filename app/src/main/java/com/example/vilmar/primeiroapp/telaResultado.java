package com.example.vilmar.primeiroapp;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class telaResultado extends AppCompatActivity {

   static  String peso,altura;
    static TextView vrText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_resultado);
        vrText=(TextView) findViewById(R.id.textResult);
        Intent vrIntent=getIntent();
        Bundle dados = vrIntent.getExtras();


    }
    public  void OnCLickCalcIMC(View v)
    {


        int peso=getIntent().getExtras().getInt("peso");
        float altura=getIntent().getExtras().getFloat("altura");
        float imc= peso/(altura*altura);

        Intent resultado= new Intent();
        Bundle dados= new Bundle();
        dados.putFloat("IMC",imc);

        resultado.putExtras(dados);
        setResult(Activity.RESULT_OK,resultado);
        this.finish();
    }

    public void onClickVoltar(View v)
    {

        this.finish();
    }
}
