package com.sumi.quoteGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by VikasN on 7/23/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String quote;
    private int length;
    private String author;
    private List<String> tags;
    private String category;
    private String title;

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuote() {
        return quote;
    }

    public int getLength() {
        return length;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }
}
