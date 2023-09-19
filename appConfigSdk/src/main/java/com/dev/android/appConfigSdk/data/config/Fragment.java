package com.dev.android.appConfigSdk.data.config;

import java.io.Serializable;
import androidx.annotation.Keep;
@Keep
public class Fragment implements Serializable {
    private Integer itemViewHolder;

    private String type;

    private String title;

    private String url;

    public Integer getItemViewHolder() {
        return this.itemViewHolder;
    }

    public void setItemViewHolder(Integer itemViewHolder) {
        this.itemViewHolder = itemViewHolder;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}