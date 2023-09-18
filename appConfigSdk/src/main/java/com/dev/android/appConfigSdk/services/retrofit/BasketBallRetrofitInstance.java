package com.dev.android.appConfigSdk.services.retrofit;

import com.dev.android.appConfigSdk.services.apis.BasketBallApi;
import com.dev.android.appConfigSdk.services.intercepters.BasketBallSiteInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BasketBallRetrofitInstance {

    private static final Gson gson = new GsonBuilder()
            .setLenient()
            .create();
    private Retrofit retrofit;
    public final BasketBallApi api;

    public BasketBallRetrofitInstance() {
        this.retrofit = createRetrofit();
        this.api = retrofit.create(BasketBallApi.class);
    }

    private OkHttpClient getClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder()
                .addInterceptor(logging)
                .addInterceptor(new BasketBallSiteInterceptor())
                .connectTimeout(1, TimeUnit.MINUTES) // connect timeout
                .writeTimeout(1, TimeUnit.MINUTES) // write timeout
                .readTimeout(1, TimeUnit.MINUTES) // read timeout
                .build();
    }

    private Retrofit createRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://v1.basketball.api-sports.io/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(getClient())
                .build();
    }
}