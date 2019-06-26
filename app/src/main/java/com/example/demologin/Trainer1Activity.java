package com.example.demologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Trainer1Activity extends AppCompatActivity {


    private Button btnMapa;
    private  Button btnRegresar;
    public double latitud, longitud;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer1);

        ImageView image = (ImageView) findViewById(R.id.imatrainer);
        TextView nombre = (TextView) findViewById(R.id.txtnombre);
        TextView genero = (TextView) findViewById(R.id.txtgenero);
        TextView nacio = (TextView) findViewById(R.id.txtnacio);
        TextView residencia = (TextView) findViewById(R.id.txtresidencia);


        final Intent intent = getIntent();
        Bundle b = intent.getExtras();
        if(b!=null)
        {
            nombre.setText(b.getString("NOM"));
            genero.setText(b.getString("GEN"));
            nacio.setText(b.getString("NAC"));
            residencia.setText(b.getString("CIU"));
            image.setImageResource(b.getInt("IMG"));
            latitud = b.getDouble("latitud");
            longitud = b.getDouble("longitud");
        }

        btnRegresar = (Button) findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                startActivity();
            }
        });

        btnMapa = (Button) findViewById(R.id.btnMapa);
        btnMapa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent mapa1 = new Intent(Trainer1Activity.this,MapsActivity.class);
                mapa1.putExtra("latitud", latitud);
                mapa1.putExtra("longitud", longitud);
                startActivity(mapa1);
            }
        });
    }

        public void startActivity() {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }

}

