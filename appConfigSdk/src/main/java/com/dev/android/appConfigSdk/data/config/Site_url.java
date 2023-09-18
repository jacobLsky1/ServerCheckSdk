package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;
import java.util.List;

public class Site_url implements Serializable {
    private List<Integer> method;

    private String url;

    private Boolean encoded;

    public List<Integer> getMethod() {
        return this.method;
    }

    public void setMethod(List<Integer> method) {
        this.method = method;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getEncoded() {
        return this.encoded;
    }

    public void setEncoded(Boolean encoded) {
        this.encoded = encoded;
    }
}
