package com.dev.android.appConfigSdk.data.config;

import androidx.annotation.Keep;

import java.io.Serializable;

@Keep
public class Admob implements Serializable {
    private String admob_app_open_ad_unit_id;

    private String admob_publisher_id;

    private String admob_banner_unit_id;

    private Boolean active;

    private String admob_interstitial_unit_id;

    private String admob_native_unit_id;

    public String getAdmob_app_open_ad_unit_id() {
        return this.admob_app_open_ad_unit_id;
    }

    public void setAdmob_app_open_ad_unit_id(String admob_app_open_ad_unit_id) {
        this.admob_app_open_ad_unit_id = admob_app_open_ad_unit_id;
    }

    public String getAdmob_publisher_id() {
        return this.admob_publisher_id;
    }

    public void setAdmob_publisher_id(String admob_publisher_id) {
        this.admob_publisher_id = admob_publisher_id;
    }

    public String getAdmob_banner_unit_id() {
        return this.admob_banner_unit_id;
    }

    public void setAdmob_banner_unit_id(String admob_banner_unit_id) {
        this.admob_banner_unit_id = admob_banner_unit_id;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getAdmob_interstitial_unit_id() {
        return this.admob_interstitial_unit_id;
    }

    public void setAdmob_interstitial_unit_id(String admob_interstitial_unit_id) {
        this.admob_interstitial_unit_id = admob_interstitial_unit_id;
    }

    public String getAdmob_native_unit_id() {
        return this.admob_native_unit_id;
    }

    public void setAdmob_native_unit_id(String admob_native_unit_id) {
        this.admob_native_unit_id = admob_native_unit_id;
    }
}