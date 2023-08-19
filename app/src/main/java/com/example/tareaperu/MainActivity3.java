package com.example.tareaperu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button btRegister, btReInicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //Referencias
        loadUI();

        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registronuevo();
            }
        });

            btReInicio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    abrirActivity();
                }
            });
    }
        //Eventos


        private void  registronuevo(){
            Toast.makeText(this, "Registro realizado correctamente", Toast.LENGTH_LONG).show();
        }
        private void abrirActivity(){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        }

        private void loadUI(){
        btRegister = findViewById(R.id.btRegister);
        btReInicio = findViewById(R.id.btReInicio);
        }
}