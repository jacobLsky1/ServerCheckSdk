package com.dev.android.appConfigSdk.services.retrofit;

import com.dev.android.appConfigSdk.services.apis.SoccerApi;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SoccerRetrofitInstance {

    private static final Gson gson = new GsonBuilder()
            .setLenient()
            .create();
    private Retrofit retrofit;
    public final SoccerApi api;

    public SoccerRetrofitInstance() {
        this.retrofit = createRetrofit();
        this.api = retrofit.create(SoccerApi.class);
    }

    private OkHttpClient getClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder()
                .addInterceptor(logging)
                .connectTimeout(1, TimeUnit.MINUTES) // connect timeout
                .writeTimeout(1, TimeUnit.MINUTES) // write timeout
                .readTimeout(1, TimeUnit.MINUTES) // read timeout
                .build();
    }

    private Retrofit createRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://soccer.sportmonks.com/api/v2.0/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(getClient())
                .build();
    }
}