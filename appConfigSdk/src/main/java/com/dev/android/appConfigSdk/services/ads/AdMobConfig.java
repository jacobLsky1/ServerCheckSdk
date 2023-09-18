package com.dev.android.appConfigSdk.services.ads;

import android.content.Context;
import android.content.res.Resources;

public class AdMobConfig {

    public static String getAdMobAppId(Context context) {
        Resources resources = context.getResources();
        int resId = resources.getIdentifier("admob_app_id", "string", context.getPackageName());
        if (resId != 0) {
            return resources.getString(resId);
        } else {
            // Return a default value or handle the missing resource gracefully.
            return "";
        }
    }
}
