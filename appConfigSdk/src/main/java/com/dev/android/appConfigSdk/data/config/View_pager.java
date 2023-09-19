package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;
import java.util.List;
import androidx.annotation.Keep;
@Keep
public class View_pager implements Serializable {
    private Integer amount;

    private List<Fragment> rv_fragments;

    private Boolean active;

    private List<Fragment> web_fragments;

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public List<Fragment> getRv_fragments() {
        return this.rv_fragments;
    }

    public void setRv_fragments(List<Fragment> rv_fragments) {
        this.rv_fragments = rv_fragments;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<Fragment> getWeb_fragments() {
        return this.web_fragments;
    }

    public void setWeb_fragments(List<Fragment> web_fragments) {
        this.web_fragments = web_fragments;
    }
}