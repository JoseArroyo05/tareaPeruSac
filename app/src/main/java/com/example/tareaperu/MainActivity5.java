package com.example.tareaperu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    Button btHaPedido, btRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //Referencias
        loadUI();

        //Eventos
        btHaPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pedidolisto();
            }
        });

        btRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirActivity4();
            }
        });
    }

    private void abrirActivity4(){
        Intent intent = new Intent(getApplicationContext(),MainActivity4.class);
        startActivity(intent);
    }
    private void pedidolisto(){
        Toast.makeText(this, "Pedido realizado correctamente", Toast.LENGTH_LONG).show();
    }

    private void loadUI(){
    btHaPedido = findViewById(R.id.btHaPedido);
    btRegresar = findViewById(R.id.btRegresar);
    }
}