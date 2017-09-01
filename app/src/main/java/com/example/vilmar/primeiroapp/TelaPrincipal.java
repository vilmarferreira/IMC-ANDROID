package com.example.vilmar.primeiroapp;

import android.app.Activity;
import android.content.Intent;
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
    final int COD_SEGUNDA_TELA=2;


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



    }
    public void alteraTexto(View v)
    {
        vrTexto.setText(vrEditText.getText());
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

    public void onClickCalcula(View v)
    {
        Bundle vrDados=new Bundle();
        vrDados.putInt("peso", Integer.valueOf(vrPeso.getText().toString()));
        vrDados.putFloat("altura",Float.valueOf(vrAltura.getText().toString()));
        Intent vrIntent = new Intent(this,telaResultado.class);
        vrIntent.putExtras(vrDados);
                                    //tela atual, proxima tela
       // startActivity(vrIntent); //
        startActivityForResult(vrIntent,COD_SEGUNDA_TELA); // primeiro parametro é o intent e o segundo é o codigo da tela, pois o metodo que recebe o retorno,
        // é o mesmo para varias telas, e com esse código ele vai saber de qual tela esta vindo o retorno

    }

    //Metodo que sera chamado
    public void onActivityResult(int codTela, int result, Intent dados)
    {
        if(result== Activity.RESULT_CANCELED)
        {
            return;
        }
        if(codTela==COD_SEGUNDA_TELA)
        {
            Bundle bundle= dados.getExtras();
            float imc=dados.getExtras().getFloat("IMC");
            imc = imc;
        }
    }
}