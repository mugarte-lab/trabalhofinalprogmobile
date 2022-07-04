package com.example.trabalhofinalprogmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Catalogo extends AppCompatActivity {

    private Button botao_manual_cafe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        getSupportActionBar().hide();
        IniciarComponentes();

        botao_manual_cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Catalogo.this, Infografico.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void IniciarComponentes() {

        botao_manual_cafe = findViewById(R.id.botao_manual_cafe);

        }

    }
