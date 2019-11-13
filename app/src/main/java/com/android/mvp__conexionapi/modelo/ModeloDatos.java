package com.android.mvp__conexionapi.modelo;

import com.google.gson.annotations.SerializedName;

public class ModeloDatos {

    @SerializedName("_id")
    private String _id;

    @SerializedName("query")
    private String query;

    @SerializedName("value")
    private Integer value;

    @SerializedName("campo")
    private String campo;

    @SerializedName("date_insert")
    private String date_insert;

    @SerializedName("created_at")
    private Integer created_at;




    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }


    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }


    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }


    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }


    public String getDate_insert() {
        return date_insert;
    }

    public void setDate_insert(String date_insert) {
        this.date_insert = date_insert;
    }


    public Integer getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Integer created_at) {
        this.created_at = created_at;
    }


}
