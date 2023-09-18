package com.dev.android.appConfigSdk.data.perdictions;

import androidx.annotation.Keep;

import java.util.List;

@Keep
public class Country {
    private List<PredictionsResponse.Match> matches;
    private String name;
    private String flag;

    public String get_name() {
        return this.name;
    }
    public String get_flag() {
        return this.flag;
    }
    public List<PredictionsResponse.Match> get_matches() {
        return this.matches;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setMatches(List<PredictionsResponse.Match> matches) {
        this.matches = matches;
    }

}
