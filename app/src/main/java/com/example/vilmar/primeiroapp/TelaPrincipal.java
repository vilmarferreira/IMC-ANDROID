package com.example.vilmar.primeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TelaPrincipal extends AppCompatActivity
{
    TextView vrTexto; //Variável de referencia
    EditText vrEditText;
    EditText vrAltura, vrPeso;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tela_principal);
        Log.i("INFO", "METODO onCreate() executado"); // para exibir uma mensagem no console

        //Valida a Variavel de referencia com um objeto
        //criado a partir do XML
        //Para isso usa o id declarado no XML
        // que sera declarado na classe R

        vrTexto = (TextView) findViewById(R.id.textView3);
        vrPeso=(EditText) findViewById(R.id.editPeso);
        vrAltura=(EditText) findViewById(R.id.editAltura);
        vrTexto.setText("Agora Sim");


    }
    public void alteraTexto(View v)
    {
        vrTexto.setText(vrEditText.getText());
    }

    public void calcIMC(View v)
    {
        float result=0;
        float altura,peso;
        altura= Float.valueOf(vrAltura.getText().toString());
        peso= Float.valueOf(vrPeso.getText().toString());
        result= peso/(altura*altura);
        vrTexto.setText(result+"");
    }

    //Aplicação foi destruida
    public void onDestroy()
    {
        super.onDestroy();
        Log.i("INFO", "METODO onDestroy() executado"); // para exibir uma mensagem no console
    }

    //Aplicação foi atividade
    public void onStart()
    {
        super.onStart();
        Log.i("INFO", "METODO onStart() executado"); // para exibir uma mensagem no console
    }

    //Metodo chamado quando o app volta a executar
    public void onRestart()
    {
        super.onRestart();
        Log.i("INFO", "METODO onRestart() executado"); // para exibir uma mensagem no console

    }

    //metodo chamado quando o app sofre interrupção
    public void onStop()
    {
        super.onStop();
        Log.i("INFO", "METODO onStop() executado"); // para exibir uma mensagem no console

        //Logica da interrupção
    }
}