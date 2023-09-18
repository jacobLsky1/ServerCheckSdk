package com.dev.android.appConfigSdk.services.retrofit;

import com.dev.android.appConfigSdk.services.apis.PredictionsApi;
import com.dev.android.appConfigSdk.services.intercepters.PerdictionsSiteInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PredictionsRetrofitInstance {

    private static final Gson gson = new GsonBuilder()
            .setLenient()
            .create();
    private Retrofit retrofit;
    public final PredictionsApi api;

    public PredictionsRetrofitInstance() {
        this.retrofit = createRetrofit();
        this.api = retrofit.create(PredictionsApi.class);
    }

    private OkHttpClient getClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder()
                .addInterceptor(logging)
                .addInterceptor(new PerdictionsSiteInterceptor())
                .connectTimeout(1, TimeUnit.MINUTES) // connect timeout
                .writeTimeout(1, TimeUnit.MINUTES) // write timeout
                .readTimeout(1, TimeUnit.MINUTES) // read timeout
                .build();
    }

    private Retrofit createRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://predictions-api.com/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(getClient())
                .build();
    }
}