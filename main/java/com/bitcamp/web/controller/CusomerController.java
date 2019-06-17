package com.bitcamp.web.controller;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.mapper.CustomerMapper;
import com.bitcamp.web.service.CustomerService;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CusomerController
 */
@RestController //컨트롤러의 부모는 컴포넌트이다 레스트 컨트롤러는 홈컨트롤러의 자식이다
public class CusomerController {
    @Autowired CustomerService customerService;
    @Autowired CustomerDTO customer; //@componant를해야 오토와이어드가먹음
    @RequestMapping("/count")
    public String count() {
        int count = customerService.countAll();
        System.out.println("루트로 들어옴");
        
        System.out.println("고객의 총 인원 + "+count );
        return count+"";

       
        
    }
    @RequestMapping("/login/{customer_Id}/{password}") //중괄호안 값이 바뀐다는 뜻 login쪽은 고정 안에값은index에서 가져온것.
    public String login(@PathVariable("customer_Id")String id,
                        @PathVariable("password")String pass) {
        System.out.println("AJAX로 넘어온 ID : " +id);
        System.out.println("AJAX로 넘어온 PWD : " +pass);
        customer.setCustomer_Id(id);
        customer.setPassword(pass);
       return (customerService.login(customer)==null)?"실패":"성공";
      
        
    }
    
}