package com.firebird.prometheus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello you fucking fuck";
    }
}
