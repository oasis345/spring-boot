package com.bitcamp.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
        System.out.println("루트 URL 경로로 들어옴");
        return "index";
    }
}