package com.android.mvp__conexionapi.modelo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RestRespuesta {

    @SerializedName("result")
    private List<ModeloDatos> result;

    public List<ModeloDatos> getResult() {
        return result;
    }

}
