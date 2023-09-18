package com.dev.android.appConfigSdk.services.retrofit;

import com.dev.android.appConfigSdk.data.config.AppConfigResponse;
import com.google.gson.InstanceCreator;

import java.lang.reflect.Type;

public class AppConfigResponseInstanceCreator implements InstanceCreator<AppConfigResponse> {
    @Override
    public AppConfigResponse createInstance(Type type) {
        return new AppConfigResponse(/* ... parameters if any ... */);
    }
}
