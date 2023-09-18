package com.dev.android.appConfigSdk.services.apis;


import com.dev.android.appConfigSdk.data.sportapi.nfl.NFLapiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NFLapi {
    @GET("games?")
    Call<NFLapiResponse> NFLgames(@Query("date") String date);
}
