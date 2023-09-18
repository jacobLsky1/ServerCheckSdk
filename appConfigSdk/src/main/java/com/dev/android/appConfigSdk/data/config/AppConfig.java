package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;
import java.util.List;

public class AppConfig implements Serializable {
    private Bottom_navigation bottom_navigation;

    private Exit_dialog exit_dialog;

    private Fab fab;

    private Bottom_navigation navigation_drawer;

    private Boolean has_sport_key;
    private String soccer_key;
    private String sports_key;
    private String predictions_key;

    private String type;

    private Main_ads main_ads;

    private Boolean ad_status;

    private ToolBar toolbar;

    private List<String> sports_list;

    private View_pager view_pager;

    private Search_bar search_bar;

    private Integer app_colors;

    private Sportkeys sportkeys;

    private FragmentContainerView fragmentContainerView;

    private String status;
    private Web_view web_view;

    public Bottom_navigation getBottom_navigation() {
        return this.bottom_navigation;
    }

    public void setBottom_navigation(Bottom_navigation bottom_navigation) {
        this.bottom_navigation = bottom_navigation;
    }

    public Exit_dialog getExit_dialog() {
        return this.exit_dialog;
    }

    public void setExit_dialog(Exit_dialog exit_dialog) {
        this.exit_dialog = exit_dialog;
    }

    public Fab getFab() {
        return this.fab;
    }

    public void setFab(Fab fab) {
        this.fab = fab;
    }

    public Bottom_navigation getNavigation_drawer() {
        return this.navigation_drawer;
    }

    public void setNavigation_drawer(Bottom_navigation navigation_drawer) {
        this.navigation_drawer = navigation_drawer;
    }

    public String getSoccerKey() {
        return this.soccer_key;
    }

    public void setSoccerKey(String soccer_key) {
        this.soccer_key = soccer_key;
    }
    public String getSportsKey() {
        return this.sports_key;
    }

    public void setSportsKey(String sports_key) {
        this.sports_key = sports_key;
    }
    public String getPredictionsKey() {
        return this.predictions_key;
    }
    public void setPredictionsKey(String predictions_key) {
        this.predictions_key = predictions_key;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Main_ads getMain_ads() {
        return this.main_ads;
    }

    public void setMain_ads(Main_ads main_ads) {
        this.main_ads = main_ads;
    }

    public Boolean getHas_sport_key() {
        return this.has_sport_key;
    }

    public void setHas_sport_key(Boolean has_sport_key) {
        this.has_sport_key = has_sport_key;
    }
    public Boolean getAd_status() {
        return this.ad_status;
    }

    public void setAd_status(Boolean ad_status) {
        this.ad_status = ad_status;
    }

    public ToolBar getToolbar() {
        return this.toolbar;
    }

    public void setToolbar(ToolBar toolbar) {
        this.toolbar = toolbar;
    }

    public List<String> getSports_list() {
        return this.sports_list;
    }

    public void setSports_list(List<String> sports_list) {
        this.sports_list = sports_list;
    }

    public View_pager getView_pager() {
        return this.view_pager;
    }

    public void setView_pager(View_pager view_pager) {
        this.view_pager = view_pager;
    }

    public Search_bar getSearch_bar() {
        return this.search_bar;
    }

    public void setSearch_bar(Search_bar search_bar) {
        this.search_bar = search_bar;
    }

    public Integer getApp_colors() {
        return this.app_colors;
    }

    public void setApp_colors(Integer app_colors) {
        this.app_colors = app_colors;
    }

    public Sportkeys getSportkeys() {
        return this.sportkeys;
    }

    public void setSportkeys(Sportkeys sportkeys) {
        this.sportkeys = sportkeys;
    }

    public FragmentContainerView getFragmentContainerView() {
        return this.fragmentContainerView;
    }

    public void setFragmentContainerView(FragmentContainerView fragmentContainerView) {
        this.fragmentContainerView = fragmentContainerView;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Web_view getWebView() {
        return this.web_view;
    }

    public void setWebView(Web_view web_view) {
        this.web_view = web_view;
    }
}
