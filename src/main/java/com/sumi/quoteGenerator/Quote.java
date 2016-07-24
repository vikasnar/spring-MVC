package com.sumi.quoteGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by VikasN on 7/23/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String quote;
    private String author;
    private String category;

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuote() {
        return quote;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

}
