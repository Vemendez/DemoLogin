package com.example.demologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trainer3Activity extends AppCompatActivity {
    private Button btnMapa;
    private  Button btnRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer3);
        btnMapa = (Button) findViewById(R.id.btnMapa);


        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(Trainer3Activity.this, MapsActivity.class);
                inten.putExtra("mapa", "3"); /* Put your id to your next Intent */

                /*Bundle b = new Bundle();
                b.putInt("key", 3); //Your id
                inten.putExtras(b); /* Put your id to your next Intent */
                startActivity(inten);
            }
        });

        btnRegresar=(Button)findViewById(R.id.btnRegresar);


        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten =new Intent(Trainer3Activity.this, SecondActivity.class);
                startActivity(inten);
            }
        });
    }}