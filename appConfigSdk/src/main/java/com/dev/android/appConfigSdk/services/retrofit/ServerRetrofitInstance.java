package com.dev.android.appConfigSdk.services.retrofit;

import com.dev.android.appConfigSdk.data.config.AppConfigResponse;
import com.dev.android.appConfigSdk.services.apis.ServerAPI;
import com.dev.android.appConfigSdk.services.intercepters.HeaderInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServerRetrofitInstance {

    private String userAgent;
    private String baseurl;
    private static final Gson gson = new GsonBuilder()
            .setLenient()
            .registerTypeAdapter(AppConfigResponse.class, new AppConfigResponseInstanceCreator())
            .create();
    private Retrofit retrofit;
    public final ServerAPI api;

    public ServerRetrofitInstance(String userAgent, String baseurl) {
        this.userAgent = userAgent;
        this.baseurl = baseurl;
        this.retrofit = createRetrofit();
        this.api = retrofit.create(ServerAPI.class);
    }

    private OkHttpClient getClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder()
                .addInterceptor(logging)
                .addInterceptor(new HeaderInterceptor(userAgent))
                .connectTimeout(1, TimeUnit.MINUTES) // connect timeout
                .writeTimeout(1, TimeUnit.MINUTES) // write timeout
                .readTimeout(1, TimeUnit.MINUTES) // read timeout
                .build();
    }

    private Retrofit createRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://solutioninformatics.com/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(getClient())
                .build();
    }
}