package com.example.appvotee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    Button botaoIniciar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoIniciar = findViewById(R.id.botaoIniciar);

        botaoIniciar.setOnClickListener(
                v -> {
                    Intent MainActivityTituloEleitor = new Intent(getApplicationContext(), MainActivityTituloEleitor.class);
                    startActivity(MainActivityTituloEleitor);
                    //new Thread(new ClientThread()).start();

        });
    }
}