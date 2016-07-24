package com.sumi.quoteGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by VikasN on 7/23/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteResponse {

    private Success success;
    private Contents contents;

    public void setSuccess(Success success) {
        this.success = success;
    }

    public void setContents(Contents contents) {
        this.contents = contents;
    }

    public Success getSuccess() {
        return success;
    }

    public Contents getContents() {
        return contents;
    }

    public Quote getQuote(){
        List<Quote> quotes = contents.getQuoteList().getQuotes();
        if(quotes!=null && quotes.size()!=0)
            return quotes.get(0);
        return null;
    }
}
