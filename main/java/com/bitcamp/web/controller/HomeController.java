package com.bitcamp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 */
@Controller //빈으로 등록하기 (캡슐화)
public class HomeController {
    @RequestMapping("/") //<- 주소 끝에 이안에 내용이 들어가야 아레 매소드가 실행됨
    public String  name() {
        System.out.println("루트 URL 경로로 들어옴@");
        return "index";
        
    }

    
}
