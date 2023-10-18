package com.dev.android.appConfigSdk.services.server;

import android.content.Context;
import android.content.SharedPreferences;

import com.dev.android.appConfigSdk.Util;

public class MySharedPreferences {
    private static final String PREF_NAME = "AppConfigSdk";
    private static final String KEY_USER_ID = "userID";

    public static String checkAndSetUserID(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);

        // Check if "userID" exists in SharedPreferences
        if (sharedPreferences.contains(KEY_USER_ID)) {
            String userID = sharedPreferences.getString(KEY_USER_ID, "");

            // Set the value in Util.Companion.userIDInfo
            Util.companion.userIDInfo = userID;

            // Set Util.Companion.hasUserIDInfo to true
            Util.companion.hasUserIDInfo = true;
            return userID;
        } else {
            return "";
        }
    }

    public static void setUserID(String userId,Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        sharedPreferences.edit().putString(KEY_USER_ID,userId).apply();
    }
}

