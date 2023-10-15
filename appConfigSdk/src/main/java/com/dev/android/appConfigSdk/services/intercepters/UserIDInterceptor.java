package com.dev.android.appConfigSdk.services.intercepters;

import com.dev.android.appConfigSdk.Util;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class UserIDInterceptor implements Interceptor {
    public UserIDInterceptor(String userID) {
        Util.companion.userIDInfo = userID;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request newRequest = chain.request().newBuilder()
                .addHeader("User-ID", Util.companion.userIDInfo)
                .build();
        return chain.proceed(newRequest);
    }
}

