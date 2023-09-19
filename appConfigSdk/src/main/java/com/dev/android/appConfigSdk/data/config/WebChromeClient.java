package com.dev.android.appConfigSdk.data.config;


import java.io.Serializable;
import java.util.List;
import androidx.annotation.Keep;
@Keep
public class WebChromeClient implements Serializable {
    private List<String> methods;

    private Boolean active;

    public List<String> getMethods() {
        return this.methods;
    }

    public void setMethods(List<String> methods) {
        this.methods = methods;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
