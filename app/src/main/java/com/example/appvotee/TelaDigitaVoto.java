package com.example.appvotee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaDigitaVoto extends AppCompatActivity {
    Button botaoConfirmaVoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_digita_voto);

        botaoConfirmaVoto  = findViewById(R.id.botaoConfirmaVoto);
        EditText campoVoto = findViewById(R.id.inputVoto);


        botaoConfirmaVoto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new MessageSender().execute(campoVoto.getText().toString());
                campoVoto.getText().clear();
                Intent telaFinaliza = new Intent(getApplicationContext(), Finaliza.class);
                startActivity(telaFinaliza);
            }
        });
    }
}