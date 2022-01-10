package com.example.appvotee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaDigitaVoto extends AppCompatActivity {
    Button botaoConfirmaVoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_digita_voto);

        botaoConfirmaVoto  = findViewById(R.id.botaoConfirmaVoto);

        botaoConfirmaVoto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent telaFinaliza = new Intent(getApplicationContext(), Finaliza.class);
                startActivity(telaFinaliza);
            }
        });
    }
}