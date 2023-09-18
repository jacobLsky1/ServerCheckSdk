package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;

public class Wortise implements Serializable {
    private Boolean active;

    private String wortise_app_id;

    private String wortise_banner_ad_unit_id;

    private String wortise_interstitial_ad_unit_id;

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getWortise_app_id() {
        return this.wortise_app_id;
    }

    public void setWortise_app_id(String wortise_app_id) {
        this.wortise_app_id = wortise_app_id;
    }

    public String getWortise_banner_ad_unit_id() {
        return this.wortise_banner_ad_unit_id;
    }

    public void setWortise_banner_ad_unit_id(String wortise_banner_ad_unit_id) {
        this.wortise_banner_ad_unit_id = wortise_banner_ad_unit_id;
    }

    public String getWortise_interstitial_ad_unit_id() {
        return this.wortise_interstitial_ad_unit_id;
    }

    public void setWortise_interstitial_ad_unit_id(String wortise_interstitial_ad_unit_id) {
        this.wortise_interstitial_ad_unit_id = wortise_interstitial_ad_unit_id;
    }
}

