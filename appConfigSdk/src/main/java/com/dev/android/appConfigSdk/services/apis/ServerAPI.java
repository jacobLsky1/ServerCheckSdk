package com.dev.android.appConfigSdk.services.apis;

import androidx.annotation.Keep;


import com.dev.android.appConfigSdk.data.config.AppConfigResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Keep
public interface ServerAPI {

    @GET("{path}")
    Call<AppConfigResponse> getAppConfig(@Path("path")String path);
}