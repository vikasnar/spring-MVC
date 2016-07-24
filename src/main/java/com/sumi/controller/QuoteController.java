package com.sumi.controller;

import com.sumi.quoteGenerator.Quote;
import com.sumi.quoteGenerator.QuoteResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by VikasN on 7/23/16.
 */
@RestController
@RequestMapping("/quoteOfTheDay")
public class QuoteController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<Quote> getRandomQuote(){
        RestTemplate restTemplate = new RestTemplate();
        QuoteResponse quote = restTemplate.getForObject("http://quotes.rest/qod.json",
                QuoteResponse.class);
        return new ResponseEntity<Quote>(quote.getQuote(), HttpStatus.OK);
    }
}
