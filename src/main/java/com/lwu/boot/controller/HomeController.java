package com.lwu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lwu on 9/2/16.
 */
@RestController
public class HomeController {

    @RequestMapping
    public String home() {
        return "LWU Boot, reporting for duty!";
    }
}
