package com.dev.android.appConfigSdk.services.apis;


import com.dev.android.appConfigSdk.data.sportapi.hockey.HockeyApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HockeyApi {
    @GET("games?")
    Call<HockeyApiResponse> hockeyGames(@Query("date") String date);
}
