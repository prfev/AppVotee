package com.example.appvotee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaEscolhaVoto extends AppCompatActivity {
    Button botaoSenador;
    Button botaoPresidente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_escolha_voto);

        botaoPresidente = findViewById(R.id.btnPresidente);
        botaoSenador = findViewById(R.id.btnSenador);

        botaoPresidente.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent TelaDigitaVoto = new Intent(getApplicationContext(), TelaDigitaVoto.class);
                startActivity(TelaDigitaVoto);
            }
        });
        botaoSenador.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v1) {
                Intent TelaDigitaVoto=new Intent(getApplicationContext(), TelaDigitaVoto.class);
                startActivity(TelaDigitaVoto);
            }
        });
    }
}