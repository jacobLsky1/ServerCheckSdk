package com.dev.android.appConfigSdk;


import androidx.lifecycle.MutableLiveData;

import com.dev.android.appConfigSdk.data.config.Actions;
import com.dev.android.appConfigSdk.data.config.Admob;
import com.dev.android.appConfigSdk.data.config.Fragment;
import com.dev.android.appConfigSdk.data.config.IronSource;
import com.dev.android.appConfigSdk.data.config.Site_url;
import com.dev.android.appConfigSdk.data.config.Startapp;
import com.dev.android.appConfigSdk.data.config.Unity;
import com.dev.android.appConfigSdk.data.config.WebChromeClient;
import com.dev.android.appConfigSdk.data.config.Wortise;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static class Companion {

        public MutableLiveData<Integer> requestError = new MutableLiveData<>(0);

        public String serverBackup = "";
        public String sportBackup = "https://www.espn.com/";
        public String backUpSite = "";
        public String userAgentInfo = "";



        //------------------------------ all app config aspects ------------------------------

        public String status = "";
        public String appType = "";

        //------------------------------ sport key ------------------------------

        public Boolean hasSportKey = false;
        public Boolean isKeyEncoded = false;
        public String soccerKey = "";
        public String sportKey = "";
        public String predictionsKey = "";
        public List<Integer> sportKeyEncodeMethod = new ArrayList<>();

        public List<String> listOfMenuActions = new ArrayList<>();
        public List<String> listOfBottomBarActions = new ArrayList<>();
        public List<String> listOfFabActions = new ArrayList<>();
        public List<String> listOfViewPagerActions = new ArrayList<>();

        //------------------------------ tool bar  ------------------------------

        public Boolean hasToolBar = false;
        public List<Fragment> toolBarWEBMenuItems = new ArrayList<>();
        public List<Fragment> toolBarRVMenuItems = new ArrayList<>();

        //------------------------------ nav drawer ------------------------------

        public Boolean hasNavDrawer = false;
        public List<Fragment> navDrawerWEBMenuItems = new ArrayList<>();
        public List<Fragment> navDrawerRVMenuItems = new ArrayList<>();

        //------------------------------ bottom nav bar ------------------------------

        public Boolean hasBottomNavBar = false;
        public List<Fragment> BottomNavWEBMenuItems = new ArrayList<>();
        public List<Fragment> BottomNavRVMenuItems = new ArrayList<>();

        //------------------------------ search bar ------------------------------

        public Boolean hasSearchBar = false;
        public String searchBarType = "";

        //------------------------------ Floating action button ------------------------------

        public Boolean hasFAB = false;
        public Boolean datePicker = false;
        public Boolean fabWeb = false;
        public List<Fragment> fabFragments = new ArrayList<>();

        //------------------------------ ViewPager ------------------------------

        public Boolean hasViewPager = false;
        public Integer amountOfScreens = 0;
        public List<Fragment> fragmentsWebForViewPager = new ArrayList<>();
        public List<Fragment> fragmentsRVForViewPager = new ArrayList<>();

        //------------------------------ fragmentContainerView ------------------------------
        public Boolean hasFragmentContainerView = false;
        public Integer fragmentContainerViewFragmentType = 0;
        public Fragment fragmentContainerViewUrl = null;

        //------------------------------ exit dialog ------------------------------
        public Boolean hasExitDialog = false;
        public String exitDialogMessage = "";
        public List<Actions> exitDialogActions = new ArrayList<>();

        //------------------------------ app colors ------------------------------
        public Integer theme = 1;

        //------------------------------ ads status ------------------------------
        public Boolean hasAds = false;
        public Admob admob = null;
        public Startapp startapp = null;
        public Unity unity = null;
        public Wortise wortise = null;
        public IronSource ironSource = null;

        //------------------------------ web view ------------------------------
        public Boolean webViewHasCache = false;
        public Boolean webViewHasZoom = false;
        public Boolean webViewHasSwipeRefresh = false;
        public WebChromeClient webViewClient = null;
        public Site_url webViewUrl = null;

    }

    public static Companion companion = new Companion();
}