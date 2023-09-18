package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;

public class Startapp implements Serializable {
    private String startapp_app_id;

    private Boolean active;

    public String getStartapp_app_id() {
        return this.startapp_app_id;
    }

    public void setStartapp_app_id(String startapp_app_id) {
        this.startapp_app_id = startapp_app_id;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}