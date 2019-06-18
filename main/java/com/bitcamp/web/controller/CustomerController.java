package com.bitcamp.web.controller;

import java.util.HashMap;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping(value="/customers")
public class CustomerController {
    @Autowired CustomerDTO customer; //@componant를해야 오토와이어드가먹음

    // @RequestMapping("/count")
    //     public String count() {
    //     int count = customerService.countAll();
    //     System.out.println("루트로 들어옴");
        
    //     System.out.println("고객의 총 인원 + "+count );
    //     return count+"";
  
    @Autowired CustomerService customerService; // 자동으로 자신의 타입을 찾아서 의존성을 주입함

    @RequestMapping("/{customer_Id}/{password}")
        //중괄호안 값이 바뀐다는 뜻 login쪽은 고정 안에값은index에서 가져온것.
        // 앞으로는 public CustomerDTO로 다 리턴한다
        //아래 반납은 index로 넘길떄 객체로 넘기는것이 DTO이다
        //mapper에서 받아오는건 위에 카운트는 int로 받아왓다 그리고 넘길떈 string으로 넘겻다.
        //string으로 넘긴건 객체지향 코딩(Restful방식이)아닌 연습용이다.
        // public String login(@PathVariable("customer_Id")String id,
        //                     @PathVariable("password")String pass) {
        //     System.out.println("AJAX로 넘어온 ID : " +id);
        //     System.out.println("AJAX로 넘어온 PWD : " +pass);
        //     customer.setCustomer_Id(id);
        //     customer.setPassword(pass);
        //    return (customerService.login(customer)==null)?"실패":"성공";
    public CustomerDTO login(@PathVariable("customer_Id")String customer_Id,
                            @PathVariable("password")String password) { // PathVariadble -> URI에 받아온 데이터를 파라미터로 가져옴
        return customerService.login(customer_Id, password);
    }

    @RequestMapping("/count")
    public String count(){
        return customerService.count() + "";
    }

    @RequestMapping(value="/join", method=RequestMethod.POST)
    public HashMap<?, ?> requestMethodName(@RequestBody CustomerDTO param) { // JSON을 DTO 필드명에 맞춰서 알아서 값이 들어감
        HashMap<String, Object> map = new HashMap<>();
        System.out.println(param.toString());
        customerService.addCustomer(param);
        map.clear();
        map.put("result", "SUCCESS");
        return map;
    }
    
    
}