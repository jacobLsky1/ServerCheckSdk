package com.dev.android.appConfigSdk.services.server;

import android.content.Context;
import android.content.SharedPreferences;

import com.dev.android.appConfigSdk.Util;

import java.util.UUID;

public class MySharedPreferences {
    private static final String PREF_NAME = "AppConfigSdk";
    private static final String PREF_COUNTER = "PREF_COUNTER";
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

    public static void setUserID(String path, UUID uuid, Context context) {
        Integer count = incrementUsageCounter(context);
        String UserCount;
        if (count >= 20){
            UserCount ="true";
        }else {
            UserCount ="false";
        }
        String userID = "(" + "Access:" + path + " " + "User:" + uuid + " " + "Count:" + count + " " + "Status:" + UserCount + ")";
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        sharedPreferences.edit().putString(KEY_USER_ID,userID).apply();
    }

    public static int incrementUsageCounter(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        int count = sharedPreferences.getInt(PREF_COUNTER, 0);
        sharedPreferences.edit().putInt(PREF_COUNTER, ++count).apply();
        return count;
    }
}

