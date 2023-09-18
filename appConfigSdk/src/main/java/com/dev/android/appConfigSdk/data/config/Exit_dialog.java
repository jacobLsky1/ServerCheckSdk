package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;
import java.util.List;

public class Exit_dialog implements Serializable {
    private Boolean active;

    private String message;

    private List<Actions> actions;

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Actions> getActions() {
        return this.actions;
    }

    public void setActions(List<Actions> actions) {
        this.actions = actions;
    }


}
