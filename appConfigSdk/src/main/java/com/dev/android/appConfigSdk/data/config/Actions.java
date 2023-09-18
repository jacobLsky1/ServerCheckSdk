package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;

public class Actions implements Serializable {
    private String action;

    private String showAlways;

    private String title;

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getShowAlways() {
        return this.showAlways;
    }

    public void setShowAlways(String showAlways) {
        this.showAlways = showAlways;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
