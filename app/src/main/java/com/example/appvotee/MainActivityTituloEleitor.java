package com.example.appvotee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityTituloEleitor extends AppCompatActivity {
    Button botaoProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_titulo_eleitor);

        botaoProximo=findViewById(R.id.botaoConfirmaTitulo);
        EditText campoTitulo = findViewById(R.id.inputTitulo);

        botaoProximo.setOnClickListener(v -> {
            new MessageSender().execute(campoTitulo.getText().toString());
            campoTitulo.getText().clear();

            Intent telaEscolhaVoto=new Intent(getApplicationContext(), TelaEscolhaVoto.class);
            startActivity(telaEscolhaVoto);
        });


    }

}