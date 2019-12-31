package com.example.smartkirkabbogor.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetDataKir {
    @SerializedName("code")
    int code;
    @SerializedName("status")
    String status;

    @SerializedName("data")
    List <DataKir> dataKirs;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<DataKir> getDataKirs() {
        return dataKirs;
    }

    public void setDataKirs(List<DataKir> dataKirs) {
        this.dataKirs = dataKirs;
    }
}
