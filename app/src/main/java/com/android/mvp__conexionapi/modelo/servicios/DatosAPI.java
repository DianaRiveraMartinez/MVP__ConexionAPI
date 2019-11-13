package com.android.mvp__conexionapi.modelo.servicios;

import com.android.mvp__conexionapi.modelo.Data;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DatosAPI {

    @GET("data-core")
    Call<Data> obtenerResultados();

}
