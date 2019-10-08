package com.toseedata.tmh.api.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// https://www.baeldung.com/spring-spock-testing
@RestController
@RequestMapping(path = "/hello", produces = "application/json")
@Api(tags = "Sample", description = "sample controller")
public class WebController {
    @GetMapping
    public String salutation() {
        return "Hello World!";
    }
}
