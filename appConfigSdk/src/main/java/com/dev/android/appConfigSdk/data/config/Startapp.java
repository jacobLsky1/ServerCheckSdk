package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;
import androidx.annotation.Keep;
@Keep
public class Startapp implements Serializable {
    private String startapp_app_id;
    private String banner_ad_placement;

    private Boolean active;

    public String getStartapp_app_id() {
        return this.startapp_app_id;
    }

    public void setStartapp_app_id(String startapp_app_id) {
        this.startapp_app_id = startapp_app_id;
    }

    public String getStartapp_banner_ad_placement() {
        return this.banner_ad_placement;
    }

    public void setStartapp_banner_ad_placement(String banner_ad_placement) {
        this.banner_ad_placement = banner_ad_placement;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}