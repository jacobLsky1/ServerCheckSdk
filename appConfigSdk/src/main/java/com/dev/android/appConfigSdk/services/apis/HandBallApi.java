package com.dev.android.appConfigSdk.services.apis;



import com.dev.android.appConfigSdk.data.sportapi.handball.HandballApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HandBallApi {
    @GET("games?")
    Call<HandballApiResponse> handBallGames(@Query("date") String date);
}
