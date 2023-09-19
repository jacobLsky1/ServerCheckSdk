package com.dev.android.appConfigSdk.data.config;



import java.io.Serializable;
import androidx.annotation.Keep;
@Keep
public class AppConfigResponse implements Serializable {
  private AppConfig appConfig;

  public AppConfig getAppConfig() {
    return this.appConfig;
  }

  public void setAppConfig(AppConfig appConfig) {
    this.appConfig = appConfig;
  }

}
