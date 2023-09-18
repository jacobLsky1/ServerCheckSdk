package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;


public class Web_view implements Serializable {
    private Boolean cache;

    private Site_url site_url;

    private Boolean swipe_refresh;

    private WebChromeClient WebChromeClient;

    private Boolean zoom;

    private WebChromeClient WebViewClient;

    public Boolean getCache() {
      return this.cache;
    }

    public void setCache(Boolean cache) {
      this.cache = cache;
    }

    public Site_url getSite_url() {
      return this.site_url;
    }

    public void setSite_url(Site_url site_url) {
      this.site_url = site_url;
    }

    public Boolean getSwipe_refresh() {
      return this.swipe_refresh;
    }

    public void setSwipe_refresh(Boolean swipe_refresh) {
      this.swipe_refresh = swipe_refresh;
    }

    public WebChromeClient getWebChromeClient() {
      return this.WebChromeClient;
    }

    public void setWebChromeClient(WebChromeClient WebChromeClient) {
      this.WebChromeClient = WebChromeClient;
    }

    public Boolean getZoom() {
      return this.zoom;
    }

    public void setZoom(Boolean zoom) {
      this.zoom = zoom;
    }

    public WebChromeClient getWebViewClient() {
      return this.WebViewClient;
    }

    public void setWebViewClient(WebChromeClient WebViewClient) {
      this.WebViewClient = WebViewClient;
    }



  }

