package com.android.mvp__conexionapi.modelo;

import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("RestResponse")
    private RestRespuesta restRespuesta;

    public RestRespuesta obtenerRestRespuesta() {
        return restRespuesta;
    }
}

