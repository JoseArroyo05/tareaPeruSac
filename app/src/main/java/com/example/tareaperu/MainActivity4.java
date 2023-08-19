package com.example.tareaperu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    Button btPedidos, btInfo, btSalir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //Referencias
        loadUI();

        //Eventos
        btPedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirActivity5();
            }
        });

        btInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirActivity6();
            }
        });

        btSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActivity();
            }
        });
    }


        private void abrirActivity(){
        Intent intent= new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        }
        private void abrirActivity6(){
        Intent intent = new Intent(getApplicationContext(), MainActivity6.class);
        startActivity(intent);
        }
        private void abrirActivity5(){
        Intent intent = new Intent(getApplicationContext(),MainActivity5.class);
            startActivity(intent);
        }

        private void loadUI(){
        btPedidos = findViewById(R.id.btPedidos);
        btInfo = findViewById(R.id.btinfo);
        btSalir = findViewById(R.id.btsalir);
        }
}