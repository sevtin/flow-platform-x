/*
 * *
 *  * Created by yh@fir.im
 *  * Copyright fir.im
 *
 */

package com.flow.platform.api.domain;

public class Step extends Node {

    private Boolean isAllowFailure;

    private String plugin;

    public Boolean getAllowFailure() {
        return isAllowFailure;
    }

    public void setAllowFailure(Boolean allowFailure) {
        isAllowFailure = allowFailure;
    }

    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }
}