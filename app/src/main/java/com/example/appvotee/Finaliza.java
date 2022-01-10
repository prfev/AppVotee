package com.example.appvotee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Finaliza extends AppCompatActivity {
    Button botaoFinaliza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finaliza);

        botaoFinaliza  = findViewById(R.id.btnFinaliza);

        botaoFinaliza.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent telaInicial = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(telaInicial);
            }
        });
    }
}