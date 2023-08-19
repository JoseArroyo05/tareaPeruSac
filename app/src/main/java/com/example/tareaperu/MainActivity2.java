package com.example.tareaperu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button btCambios, btReIni;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Referencias
        loadUI();

        //Eventos
        btCambios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CambioListo();
            }
        });

        btReIni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirActivity();
            }
        });
    }

        private void CambioListo(){
            Toast.makeText(this, "Cambio realizado correctamente", Toast.LENGTH_LONG).show();
    }

        private void abrirActivity(){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        }

    //Metodo para referenciar los widgets
    private void loadUI(){
    btCambios = findViewById(R.id.btCambios);
    btReIni = findViewById(R.id.btReIni);
    }

}