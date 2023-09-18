package com.dev.android.appConfigSdk.services.apis;



import com.dev.android.appConfigSdk.data.sportapi.volleyball.VolleyBallApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface VolleyBallApi {
    @GET("games?")
    Call<VolleyBallApiResponse> volleyBallGames(@Query("date") String date);
}
