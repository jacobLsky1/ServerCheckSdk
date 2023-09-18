package com.dev.android.appConfigSdk.services.apis;


import com.dev.android.appConfigSdk.data.sportapi.baseball.BaseBallApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BaseBallApi {
    @GET("games?")
    Call<BaseBallApiResponse> baseballGames(@Query("date") String date);
}
