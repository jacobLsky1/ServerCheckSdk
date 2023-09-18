package com.dev.android.appConfigSdk.services.apis;



import com.dev.android.appConfigSdk.data.sportmonks.SoccerApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
public interface SoccerApi {
    @GET("fixtures/date/{date}?&include=localTeam,visitorTeam,league,league.country")
    Call<SoccerApiResponse> soccerGames(@Path("date") String date, @Query("api_token") String api);
}
