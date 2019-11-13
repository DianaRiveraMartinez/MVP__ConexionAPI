package com.android.mvp__conexionapi.presentador;

import com.android.mvp__conexionapi.modelo.Data;
import com.android.mvp__conexionapi.modelo.ModeloDatos;
import com.android.mvp__conexionapi.modelo.servicios.DatosServicio;
import com.android.mvp__conexionapi.vista.DatosVista;
import com.android.mvp__conexionapi.vista.MainActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DatosPresentador {

    private DatosVista datosVista;
    private DatosServicio datosServicio;

    public DatosPresentador(MainActivity vista) {
        this.datosVista = vista;

        if (this.datosServicio == null) {
            this.datosServicio = new DatosServicio();
        }
    }

    public void obtenerDatos() {
        datosServicio
                .obtenerAPI()
                .obtenerResultados()
                .enqueue(new Callback<Data>() {
                    @Override
                    public void onResponse(Call<Data> call, Response<Data> response) {
                        Data data = response.body();

                        if (data != null && data.obtenerRestRespuesta() != null) {
                            List<ModeloDatos> resultado = data.obtenerRestRespuesta().getResult();
                            datosVista.datosLista(resultado);
                        }
                    }

                    @Override
                    public void onFailure(Call<Data> call, Throwable t) {
                        try {
                            throw new InterruptedException("Algo fallo");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }

}
