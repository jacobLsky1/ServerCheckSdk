package com.dev.android.appConfigSdk.services.apis;


import com.dev.android.appConfigSdk.data.sportapi.rugby.RugbyApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RugbyApi {
    @GET("games?")
    Call<RugbyApiResponse> rugbyGames(@Query("date") String date);
}
