package com.android.mvp__conexionapi.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.android.mvp__conexionapi.R;
import com.android.mvp__conexionapi.modelo.ModeloDatos;
import com.android.mvp__conexionapi.presentador.DatosPresentador;

import java.util.List;

public class MainActivity extends AppCompatActivity implements DatosVista {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DatosPresentador datosPresentador = new DatosPresentador(this);
        datosPresentador.obtenerDatos();
    }



    @Override
    public void datosLista(List<ModeloDatos> datos) {


        for (ModeloDatos dato : datos) {
            String contenido = "";
            contenido += "ID: " + dato.get_id() + "\n";
            contenido += "Query: " + dato.getQuery() + "\n";
            contenido += "Valor: " + dato.getValue() + "\n";
            contenido += "Campo: " + dato.getCampo() + "\n";
            contenido += "Fecha insertada: " + dato.getDate_insert() + "\n";
            contenido += "Creación: " + dato.getCreated_at() + "\n" + "\n" + "\n";

        }
    }
}

