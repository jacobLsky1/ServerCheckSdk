package com.dev.android.appConfigSdk.services;

public class CreateUserId {
    public static void createUserId(String uniqueID, int count) {
        String UserCount;
        if (count >= 20){
            UserCount ="true";
        }else {
            UserCount ="false";
        }
        String userID = "(" + "Access:" + ACCESS_KEY + " " + "User:" + uniqueID + " " + "Count:" + count + " " + "Status:" + UserCount + ")";
        UserIdInfo = userID;
    }
}
