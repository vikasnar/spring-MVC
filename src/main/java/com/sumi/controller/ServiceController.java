package com.sumi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by VikasN on 7/18/16.
 */
@RestController
@RequestMapping("/helpme")
public class ServiceController {

    private static Logger LOGGER = LoggerFactory.getLogger(ServiceController.class);

    @Value("${author.name}") String authorName;

    @RequestMapping(value = "author", method = {RequestMethod.GET, RequestMethod.POST},
    produces = "application/json")
    public ResponseEntity<Author> getAuthorInfo(@Value("${author.name}") String authorName,
                                                @Value("${author.email}") String authorEmail){
        final Author author = new Author();
        author.setName(authorName);
        author.setEmail(authorEmail);
        return new ResponseEntity<>(author, HttpStatus.OK);
    }


}
