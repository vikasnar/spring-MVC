package com.sumi.quoteGenerator;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * Created by VikasN on 7/23/16.
 */
@RestController
@RequestMapping("/quoteOfTheDay")
public class QuoteController {

    private final Logger logger = Logger.getLogger(QuoteController.class);
    private static final String APPLICATION_KEY = "VDCQbVQnQomshXJy2VbSTStYpnc0p1a4ZUcjsnWK9BG07K51ha";
    private static final String API_ENDPOINT = "https://andruxnet-random-famous-quotes.p.mashape.com/?cat=famous";

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String getRandomQuote(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.set("X-Mashape-Key", APPLICATION_KEY);
        HttpEntity<?> requestEntity = new HttpEntity<Object>(headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(API_ENDPOINT, HttpMethod.GET,
                requestEntity,String.class);
        Quote quote = mapToJSON(responseEntity.getBody());
        return quote.getQuote()+"\n BY "+quote.getAuthor();
    }

    public Quote mapToJSON(String jsonString){
        try {
            ObjectMapper mapper = new ObjectMapper();
            Quote quote = mapper.readValue(jsonString, Quote.class);
            return quote;
        }
        catch (Exception e){
            logger.error("Unable to Map to Object", e);
            return null;
        }
    }

}
