package com.sumi.quoteGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by VikasN on 7/23/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contents {

    private List<Quote> quotes;

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public List<Quote> getQuotes() {
        return quotes;
    }
}
