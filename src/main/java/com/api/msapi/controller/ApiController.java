package com.api.msapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/v1/getData")
    public String getData() {
        return "Controller Created";
    }
}
