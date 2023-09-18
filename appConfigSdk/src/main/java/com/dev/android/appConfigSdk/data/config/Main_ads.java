package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;

public class Main_ads implements Serializable {
    private Unity unity;

    private Startapp startapp;

    private Admob admob;

    private Wortise wortise;
    private IronSource ironSource;

    public Unity getUnity() {
        return this.unity;
    }

    public void setUnity(Unity unity) {
        this.unity = unity;
    }

    public Startapp getStartapp() {
        return this.startapp;
    }

    public void setStartapp(Startapp startapp) {
        this.startapp = startapp;
    }

    public Admob getAdmob() {
        return this.admob;
    }

    public void setAdmob(Admob admob) {
        this.admob = admob;
    }

    public Wortise getWortise() {
        return this.wortise;
    }

    public void setWortise(Wortise wortise) {
        this.wortise = wortise;
    }

    public IronSource getIronSource() {
        return this.ironSource;
    }

    public void setIronSource(IronSource ironSource) {
        this.ironSource = ironSource;
    }
}
