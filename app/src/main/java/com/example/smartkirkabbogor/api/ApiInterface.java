package com.example.smartkirkabbogor.api;

import com.example.smartkirkabbogor.model.GetDataKir;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("wajib_uji_list")
    Call<GetDataKir> getDataKir(@Query("no_uji") String noUji);
}
