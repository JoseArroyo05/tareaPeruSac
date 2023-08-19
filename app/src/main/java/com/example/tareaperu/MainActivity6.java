package com.example.tareaperu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    Button btReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        //Referencias
        loadUI();

        //Eventos
        btReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirActivity4();
            }
        });
    }

    private void abrirActivity4(){
        Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
        startActivity(intent);
    }

    private void loadUI(){
        btReturn = findViewById(R.id.btReturn);
    }
}