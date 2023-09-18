package com.dev.android.appConfigSdk.services.apis;


import com.dev.android.appConfigSdk.data.perdictions.PredictionsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PredictionsApi {
    @GET("api")
    Call<PredictionsResponse> getPredictions(
            @Query("token")String str
    );
}
