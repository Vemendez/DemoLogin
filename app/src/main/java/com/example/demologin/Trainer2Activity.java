package com.example.demologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trainer2Activity extends AppCompatActivity {
    private Button btnMapa;
    private  Button btnRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer2);



        btnMapa=(Button)findViewById(R.id.button);


        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten =new Intent(Trainer2Activity.this, MapsActivity.class);
                inten.putExtra("mapa", "2"); /* Put your id to your next Intent */

                /*Bundle b = new Bundle();
                b.putInt("key", 2); //Your id
                inten.putExtras(b); /* Put your id to your next Intent */
                startActivity(inten);
            }
        });

        btnRegresar=(Button)findViewById(R.id.button2);


        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten =new Intent(Trainer2Activity.this, SecondActivity.class);
                startActivity(inten);
            }
        });
    }}
