package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;
import java.util.List;
import androidx.annotation.Keep;
@Keep
public class ToolBar implements Serializable {
    private List<Fragment> web_menu;

    private Boolean active;

    private List<Fragment> rv_menu;

    public List<Fragment> getWeb_menu() {
        return this.web_menu;
    }

    public void setWeb_menu(List<Fragment> web_menu) {
        this.web_menu = web_menu;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<Fragment> getRv_menu() {
        return this.rv_menu;
    }

    public void setRv_menu(List<Fragment> rv_menu) {
        this.rv_menu = rv_menu;
    }
}
