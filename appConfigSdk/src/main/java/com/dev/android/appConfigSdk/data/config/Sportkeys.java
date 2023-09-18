package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;
import java.util.List;

public class Sportkeys implements Serializable {
    private List<Integer> method;

    private Boolean encoded;

    public List<Integer> getMethod() {
        return this.method;
    }

    public void setMethod(List<Integer> method) {
        this.method = method;
    }

    public Boolean getEncoded() {
        return this.encoded;
    }

    public void setEncoded(Boolean encoded) {
        this.encoded = encoded;
    }
}
