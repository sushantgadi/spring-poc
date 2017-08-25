package com.opensource.kagazi.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController{

    private static final String PATH = "/core";

    @RequestMapping(value = PATH)
    public String error() {
        return "Core web service worked";
    }

}