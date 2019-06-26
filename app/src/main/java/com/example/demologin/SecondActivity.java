package com.example.demologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {

    String [][] datos = {
            {"Juan Rodríguez","Masculino","04/03/1992","Santo Domingo,R.D" },
            {"Angel Tatis","Masculino","26/10/1986","Santiago,R.D"},
            {"Yeury Torres","Masculino","03/01/1977","Punta Cana,R.D"},
    };
    Integer[] imageArray = {R.drawable.entrenador_1_96,R.drawable.entrenador_2,R.drawable.entrenador_3_96};

    public double coordenada1 [] = {18.448705, 19.455950, 18.555609};
    public double co2 [] = {-69.945561, -70.673222, -68.370575};
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        listView = (ListView) findViewById(R.id.lvMiembros);
        listView.setAdapter(new CustomListAdapter(this, datos, imageArray));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent detalles = new Intent (view.getContext(), Trainer1Activity.class);
            detalles.putExtra("NOM", datos[position][0]);
            detalles.putExtra("GEN", datos[position][1]);
            detalles.putExtra("NAC", datos[position][2]);
            detalles.putExtra("CIU", datos[position][3]);
            detalles.putExtra("IMG", imageArray[position]);
            detalles.putExtra("latitud", coordenada1[position]);
            detalles.putExtra("longitud", co2[position]);
            startActivity(detalles);
    }


});
}
}
