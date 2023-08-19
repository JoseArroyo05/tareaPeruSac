package com.example.tareaperu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btMostrar2, btMostrar3, btMostrar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Referencias
    loadUI();

    //Eventos

    btMostrar1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AbrirActivity4();
        }
    });

    btMostrar2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            abrirActivity2();
        }
    });

    btMostrar3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            abrirActivity3();
        }
    });
    }

    private void abrirActivity2(){
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(intent);
    }

    private void abrirActivity3(){
        Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intent);
    }

    private void AbrirActivity4(){
        Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
        startActivity(intent);
    }

    private void loadUI(){
    btMostrar2 = findViewById(R.id.btMostrar2);
    btMostrar3 = findViewById(R.id.btMostrar3);
    btMostrar1 = findViewById(R.id.btMostrar1);

    }
}