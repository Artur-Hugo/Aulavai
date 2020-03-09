package com.devoligastudio.aula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Curriculum");



    }
    public void abrirDadosPessoais(View view){
        Intent intent = new Intent(MainActivity.this, DadosPessoaisActivity.class);
        startActivity(intent);

    }
    public void abrirDadosProfissionais(View view){
        Intent intent = new Intent(MainActivity.this, DadosProfissionaisActivity.class);
        startActivity(intent);


    }

    public void abrirContatos(View view){
        Intent intent = new Intent(MainActivity.this, ContatoActivity.class);
        startActivity(intent);

    }
}
