package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;
import androidx.annotation.Keep;
@Keep
public class FragmentContainerView implements Serializable {
    private Boolean active;

    private Integer type;

    private Fragment fragment;

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Fragment getUrl() {
        return this.fragment;
    }

    public void setUrl(Fragment fragment) {
        this.fragment = fragment;
    }
}