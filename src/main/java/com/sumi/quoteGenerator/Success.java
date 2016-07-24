package com.sumi.quoteGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by VikasN on 7/23/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Success {
    private String total;

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal() {
        return total;
    }
}
