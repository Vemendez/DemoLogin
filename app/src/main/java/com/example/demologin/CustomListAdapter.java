package com.example.demologin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context context;
    String [][] datos;
    Integer[] imageArray;
    ListView listView;

    public CustomListAdapter(Context context, String[][] datos, Integer[] imagenes){
        this.context = context;
        this.datos = datos;
        this.imageArray = imagenes;
        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {


        final View vista = inflater.inflate(R.layout.listview_fila, null);
        TextView nombre = (TextView) vista.findViewById(R.id.tvNombre);
        ImageView imagen = (ImageView) vista.findViewById(R.id.iv1);
        nombre.setText(datos[i][0]);
        imagen.setImageResource(imageArray[i]);

        return vista;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}
