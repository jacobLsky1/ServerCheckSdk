package com.dev.android.appConfigSdk.services.intercepters;

import com.dev.android.appConfigSdk.Util;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class HockeySiteInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request newRequest = chain.request().newBuilder()
                .addHeader("x-rapidapi-host", "v1.hockey.api-sports.io")
                .addHeader("x-rapidapi-key", Util.companion.sportKey)
                .build();

        return chain.proceed(newRequest);
    }
}