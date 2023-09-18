package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;

public class Search_bar implements Serializable {
    private Boolean active;

    private String type;

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
