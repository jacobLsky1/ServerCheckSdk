package com.dev.android.appConfigSdk.services.apis;

import androidx.annotation.Keep;


import com.dev.android.appConfigSdk.data.config.AppConfigResponse;

import retrofit2.Call;
import retrofit2.http.GET;

@Keep
public interface ServerAPI {

    @GET("json")
    Call<AppConfigResponse> getAppConfig();
}