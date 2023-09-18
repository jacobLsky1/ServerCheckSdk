package com.dev.android.appConfigSdk.services.apis;


import com.dev.android.appConfigSdk.data.sportapi.basketball.BasketBallApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BasketBallApi {
    @GET("games?")
    Call<BasketBallApiResponse> basketballGames(@Query("date") String date);
}
