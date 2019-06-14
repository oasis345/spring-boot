package com.bitcamp.web.controller;

import com.bitcamp.web.mapper.CustomerMapper;
import com.bitcamp.web.service.CustomerService;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CusomerController
 */
@RestController
public class CusomerController {
    @Autowired CustomerService customerService;
    @RequestMapping("/customer")
    public String index() {
        
        System.out.println("루트로 들어옴");
        
        System.out.println("고객의 총 인원 + " );
        return "customer";
        
    }
    
}