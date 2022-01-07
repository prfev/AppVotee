package com.example.appvotee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityTituloEleitor extends AppCompatActivity {
    Button botaoProximo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_titulo_eleitor);

        botaoProximo=findViewById(R.id.botaoProximo);

        botaoProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TelaEscolhaVoto=new Intent(getApplicationContext(), TelaEscolhaVoto.class);
                startActivity(TelaEscolhaVoto);
            }
        });


    }
}