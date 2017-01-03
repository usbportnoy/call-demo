package com.bbt.usbportnoy.web.endpoint.models;

/**
 * Created by jason on 1/3/17.
 */
public class Recording {
    String href;
    Long seconds;

    public Recording(String href, Long seconds) {
        this.href = href;
        this.seconds = seconds;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Long getSeconds() {
        return seconds;
    }

    public void setSeconds(Long seconds) {
        this.seconds = seconds;
    }
}
