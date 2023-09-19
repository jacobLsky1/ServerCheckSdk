package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;
import androidx.annotation.Keep;
@Keep
  public class IronSource implements Serializable {
    private String ironSource_rewarded_video_ad_unit_id;

    private String ironSource_interstitial_ad_unit_id;

    private Boolean active;

    private String ironSource_banner_ad_unit_id;

    private String ironSource_app_id;

    private String ironSource_offerwall_ad_unit_id;

    public String getIronSource_rewarded_video_ad_unit_id() {
      return this.ironSource_rewarded_video_ad_unit_id;
    }

    public void setIronSource_rewarded_video_ad_unit_id(String ironSource_rewarded_video_ad_unit_id) {
      this.ironSource_rewarded_video_ad_unit_id = ironSource_rewarded_video_ad_unit_id;
    }

    public String getIronSource_interstitial_ad_unit_id() {
      return this.ironSource_interstitial_ad_unit_id;
    }

    public void setIronSource_interstitial_ad_unit_id(String ironSource_interstitial_ad_unit_id) {
      this.ironSource_interstitial_ad_unit_id = ironSource_interstitial_ad_unit_id;
    }

    public Boolean getActive() {
      return this.active;
    }

    public void setActive(Boolean active) {
      this.active = active;
    }

    public String getIronSource_banner_ad_unit_id() {
      return this.ironSource_banner_ad_unit_id;
    }

    public void setIronSource_banner_ad_unit_id(String ironSource_banner_ad_unit_id) {
      this.ironSource_banner_ad_unit_id = ironSource_banner_ad_unit_id;
    }

    public String getIronSource_app_id() {
      return this.ironSource_app_id;
    }

    public void setIronSource_app_id(String ironSource_app_id) {
      this.ironSource_app_id = ironSource_app_id;
    }

    public String getIronSource_offerwall_ad_unit_id() {
      return this.ironSource_offerwall_ad_unit_id;
    }

    public void setIronSource_offerwall_ad_unit_id(String ironSource_offerwall_ad_unit_id) {
      this.ironSource_offerwall_ad_unit_id = ironSource_offerwall_ad_unit_id;
    }
  }
