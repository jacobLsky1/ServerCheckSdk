package com.dev.android.appConfigSdk.services.server;

import android.content.Context;
import android.util.Base64;
import android.util.Log;

import com.dev.android.appConfigSdk.Util;
import com.dev.android.appConfigSdk.data.config.AppConfig;
import com.dev.android.appConfigSdk.data.config.AppConfigResponse;
import com.dev.android.appConfigSdk.data.config.Fragment;
import com.dev.android.appConfigSdk.services.apis.ServerAPI;
import com.dev.android.appConfigSdk.services.retrofit.ServerRetrofitInstance;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ServerObj {

    public void getAppConfig(String userAgent, String baseUrl,String folder, ServerCheckCallback serverCallback, Context context) {

        String userID = MySharedPreferences.checkAndSetUserID(context);
        if(Objects.equals(userID, "")) {
            userID = setUpUserId(context, baseUrl);
        }

        ServerRetrofitInstance instance = new ServerRetrofitInstance(userAgent,decodeBase64(baseUrl),userID);

        ServerAPI apiInstance = instance.api;
        Call<AppConfigResponse> callback = apiInstance.getAppConfig(folder);

        callback.enqueue(new Callback<AppConfigResponse>() {
            @Override
            public void onResponse(Call<AppConfigResponse> call, Response<AppConfigResponse> response) {
                AppConfigResponse responseFromAPI = response.body();

                Log.e("response", "" + responseFromAPI);

                if (response.isSuccessful() && responseFromAPI != null ) {
                    AppConfig appConfig = response.body().getAppConfig();
                    Util.companion.backUpSite = appConfig.getBackupSite();


                    if(Objects.equals(appConfig.getStatus(), "ok")) {
                        Util.companion.appType = appConfig.getType();


                        if (appConfig.getSportkeys().getEncoded()) {
                            Util.companion.sportKey = decodeKey(Util.companion.sportKey, appConfig.getSportkeys().getMethod());
                            Util.companion.soccerKey = decodeKey(Util.companion.soccerKey, appConfig.getSportkeys().getMethod());
                            Util.companion.predictionsKey = decodeKey(Util.companion.predictionsKey, appConfig.getSportkeys().getMethod());
                        } else {

                            Util.companion.sportKey = appConfig.getSportsKey();
                            Util.companion.soccerKey = appConfig.getSoccerKey();
                            Util.companion.predictionsKey = appConfig.getPredictionsKey();
                        }


                        Util.companion.isKeyEncoded = appConfig.getSportkeys().getEncoded();
                        Util.companion.sportKeyEncodeMethod = appConfig.getSportkeys().getMethod();


                        Util.companion.hasToolBar = appConfig.getToolbar().getActive();
                        Util.companion.toolBarWEBMenuItems = appConfig.getToolbar().getWeb_menu();
                        Util.companion.toolBarRVMenuItems = appConfig.getToolbar().getRv_menu();
                        if (Util.companion.hasToolBar && Util.companion.toolBarRVMenuItems.size() > 0) {
                            setMenuActionList(Util.companion.toolBarRVMenuItems);
                        }
                        if (Util.companion.hasToolBar && Util.companion.toolBarWEBMenuItems.size() > 0) {
                            setMenuActionList(Util.companion.toolBarWEBMenuItems);
                        }

                        Util.companion.hasNavDrawer = appConfig.getNavigation_drawer().getActive();
                        Util.companion.navDrawerWEBMenuItems = appConfig.getNavigation_drawer().getWeb_menu();
                        Util.companion.navDrawerRVMenuItems = appConfig.getNavigation_drawer().getRv_menu();
                        if (Util.companion.hasNavDrawer && Util.companion.navDrawerRVMenuItems.size() > 0) {
                            setMenuActionList(Util.companion.navDrawerRVMenuItems);
                        }
                        if (Util.companion.hasNavDrawer && Util.companion.navDrawerWEBMenuItems.size() > 0) {
                            setMenuActionList(Util.companion.navDrawerWEBMenuItems);
                        }


                        Util.companion.hasBottomNavBar = appConfig.getBottom_navigation().getActive();
                        Util.companion.BottomNavWEBMenuItems = appConfig.getBottom_navigation().getWeb_menu();
                        Util.companion.BottomNavRVMenuItems = appConfig.getBottom_navigation().getRv_menu();
                        if (Util.companion.hasBottomNavBar && Util.companion.BottomNavRVMenuItems.size() > 0) {
                            setBottomBarActionList(Util.companion.BottomNavRVMenuItems);
                        }
                        if (Util.companion.hasBottomNavBar && Util.companion.BottomNavWEBMenuItems.size() > 0) {
                            setBottomBarActionList(Util.companion.BottomNavWEBMenuItems);
                        }


                        Util.companion.hasSearchBar = appConfig.getSearch_bar().getActive();
                        Util.companion.searchBarType = appConfig.getSearch_bar().getType();

                        Util.companion.hasFAB = appConfig.getFab().getActive();
                        Util.companion.datePicker = appConfig.getFab().getDatePicker();
                        Util.companion.fabWeb = appConfig.getFab().getWeb();
                        Util.companion.fabFragments = appConfig.getFab().getFragments();
                        if (Util.companion.hasFAB && Util.companion.fabFragments.size() > 0) {
                            setFABActionList(Util.companion.fabFragments);
                        }


                        Util.companion.hasViewPager = appConfig.getView_pager().getActive();
                        Util.companion.amountOfScreens = appConfig.getView_pager().getAmount();
                        Util.companion.fragmentsRVForViewPager = appConfig.getView_pager().getRv_fragments();
                        Util.companion.fragmentsWebForViewPager = appConfig.getView_pager().getWeb_fragments();
                        if (Util.companion.hasViewPager && Util.companion.fragmentsWebForViewPager.size() > 0) {
                            setViewPagerActionList(Util.companion.fragmentsWebForViewPager);
                        }

                        Util.companion.hasFragmentContainerView = appConfig.getFragmentContainerView().getActive();
                        Util.companion.fragmentContainerViewFragmentType = appConfig.getFragmentContainerView().getType();
                        Util.companion.fragmentContainerViewUrl = appConfig.getFragmentContainerView().getUrl();

                        Util.companion.hasExitDialog = appConfig.getExit_dialog().getActive();
                        Util.companion.exitDialogMessage = appConfig.getExit_dialog().getMessage();
                        Util.companion.exitDialogActions = appConfig.getExit_dialog().getActions();

                        Util.companion.theme = appConfig.getApp_colors();

                        Util.companion.hasAds = appConfig.getAd_status();
                        Util.companion.admob = appConfig.getMain_ads().getAdmob();
                        Util.companion.startapp = appConfig.getMain_ads().getStartapp();
                        Util.companion.unity = appConfig.getMain_ads().getUnity();
                        Util.companion.wortise = appConfig.getMain_ads().getWortise();
                        Util.companion.ironSource = appConfig.getMain_ads().getIronSource();

                        Util.companion.webViewHasCache = appConfig.getWebView().getCache();
                        Util.companion.webViewHasZoom = appConfig.getWebView().getZoom();
                        Util.companion.webViewHasSwipeRefresh = appConfig.getWebView().getSwipe_refresh();
                        Util.companion.webViewClient = appConfig.getWebView().getWebChromeClient();
                        Util.companion.webViewUrl = appConfig.getWebView().getSite_url();


                        serverCallback.onReady(true, "ok");
                    }else{
                        Util.companion.backUpSite = appConfig.getBackupSite();
                        serverCallback.onReady(false,"error");
                    }
                } else {
                    serverCallback.onReady(false,"network error");
                }
            }

            @Override
            public void onFailure(Call<AppConfigResponse> call, Throwable t) {
                serverCallback.onReady(true,"network error");
            }
        });
    }

    private String setUpUserId(Context context,String baseUrl) {
        String userId = "";
        if(!Util.companion.hasUserIDInfo){
            UUID uuid = UUID.randomUUID();
            userId = ""+baseUrl+uuid;
            MySharedPreferences.setUserID(userId,context);
        }
        return userId;
    }

    private String decodeKey(String sportKey, List<Integer> method) {
        for(int i=0; i<method.size();i++){
            sportKey = decodeBase64(sportKey);
        }
        return sportKey;
    }

    public static void setMenuActionList(List<Fragment> list){
        Util.companion.listOfMenuActions = new ArrayList<>();
        for(Fragment item : list){
            Util.companion.listOfMenuActions.add(item.getTitle());
        }
    }

    public static void setBottomBarActionList(List<Fragment> list){
        Util.companion.listOfBottomBarActions = new ArrayList<>();
        for(Fragment item : list){
            Util.companion.listOfBottomBarActions.add(item.getTitle());
        }
    }

    public static void setFABActionList(List<Fragment> list){
        Util.companion.listOfFabActions = new ArrayList<>();
        for(Fragment item : list){
            Util.companion.listOfFabActions.add(item.getTitle());
        }
    }

    public static void setViewPagerActionList(List<Fragment> list){
        Util.companion.listOfViewPagerActions = new ArrayList<>();
        for(Fragment item : list){
            Util.companion.listOfViewPagerActions.add(item.getTitle());
        }
    }

    public static String decodeBase64(String encodedString) {
        byte[] decodedBytes = Base64.decode(encodedString, Base64.DEFAULT);
        return new String(decodedBytes);
    }

    public static String encodeBase64(String inputString) {
        byte[] bytesToEncode = inputString.getBytes();
        byte[] encodedBytes = Base64.encode(bytesToEncode, Base64.DEFAULT);
        return new String(encodedBytes);
    }
}
