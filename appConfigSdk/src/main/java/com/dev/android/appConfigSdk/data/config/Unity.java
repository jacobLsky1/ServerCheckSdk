package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;
import androidx.annotation.Keep;
@Keep
public class Unity implements Serializable {
    private String unity_game_id;

    private Boolean active;

    private String unity_interstitial_placement_id;

    private String unity_banner_placement_id;

    public String getUnity_game_id() {
        return this.unity_game_id;
    }

    public void setUnity_game_id(String unity_game_id) {
        this.unity_game_id = unity_game_id;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getUnity_interstitial_placement_id() {
        return this.unity_interstitial_placement_id;
    }

    public void setUnity_interstitial_placement_id(String unity_interstitial_placement_id) {
        this.unity_interstitial_placement_id = unity_interstitial_placement_id;
    }

    public String getUnity_banner_placement_id() {
        return this.unity_banner_placement_id;
    }

    public void setUnity_banner_placement_id(String unity_banner_placement_id) {
        this.unity_banner_placement_id = unity_banner_placement_id;
    }
}
