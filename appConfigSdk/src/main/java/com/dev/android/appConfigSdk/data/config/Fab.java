package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;
import java.util.List;
import androidx.annotation.Keep;
@Keep
public class Fab implements Serializable {
    private Boolean web;

    private Boolean active;

    private Boolean datePicker;

    private List<Fragment> fragments;

    public Boolean getWeb() {
        return this.web;
    }

    public void setWeb(Boolean web) {
        this.web = web;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getDatePicker() {
        return this.datePicker;
    }

    public void setDatePicker(Boolean datePicker) {
        this.datePicker = datePicker;
    }

    public List<Fragment> getFragments() {
        return this.fragments;
    }

    public void setFragments(List<Fragment> fragments) {
        this.fragments = fragments;
    }


}
