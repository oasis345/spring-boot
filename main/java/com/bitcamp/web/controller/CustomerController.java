
/* 레스트풀방식 이개념을 무조껀 외워야한다.
    crud를 쓸려면 
    예를들어 커스터머 정보 가져오려면 
    1번 AutoWire CustomerService customerService;
    2번 Autowire CustomerDTO customerDTO;

    3번
    CRUD에서
    @postMapping("") 포스트는 안에가 비어있다. 당연히 회원가입을 하니까.
    @GetMapping("/customerId)") 무조껀 DTO를 넣는다
    @PutMmaping("/customerId") 무조껀 HashMAP
    @deleteMapping("/customerId") 무조껀 HashMAP

    기본 로직


*/

package com.bitcamp.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.service.CustomerService;
import com.bitcamp.web.common.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping(value="/customers")
public class CustomerController {
    @Autowired Printer p;
    @Autowired CustomerDTO customer; //Service 쪽에 @componant를해야 오토와이어드가먹음
    @Autowired CustomerService customerService; // 자동으로 자신의 타입을 찾아서 의존성을 주입함

    // @RequestMapping("/count")
    //     public String count() {
    //     int count = customerService.countAll();
    //     System.out.println("루트로 들어옴");
        
    //     System.out.println("고객의 총 인원 + "+count );
    //     return count+"";

  

    @GetMapping("/count")
    public String count(){
        int count = customerService.count();
        
        
        p.accept("람다가 출력한 고객의 총인원" + count);
        return customerService.count() + "";
    }

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
    

    @GetMapping("/{customer_Id}/{password}")
    public CustomerDTO login(@PathVariable("customer_Id")String customer_Id,
                            @PathVariable("password")String password) { // PathVariadble -> URI에 받아온 데이터를 파라미터로 가져옴
            System.out.println(customer_Id);
            return customerService.login(customer_Id, password);
    }

    //@RequestMapping(value="/join", method=RequestMethod.POST) 아래 메핑과 == 같다
    // xhr.open('POST','customers/join', true);
    @PostMapping("/join")
    public HashMap<?, ?> requestMethodName(@RequestBody CustomerDTO param) { // JSON을 DTO 필드명에 맞춰서 알아서 값이 들어감
        HashMap<String, Object> map = new HashMap<>();
        System.out.println(param.toString());
        customerService.addCustomer(param);
        map.clear();
        map.put("result", "SUCCESS");
        return map;

    }


    @PutMapping("/update")  //딜리트와 없데이트는 그냥 수정햇다고 말을 보내주기만해도되서 해시맵을씀
    public HashMap<?,?> PutCustomer(@RequestBody CustomerDTO param) {
        HashMap<String,Object> map= new HashMap<>();
        customerService.updateCustomer(param);
        map.clear();
        map.put("result","SUCCESS");
        return map;
    }

    @DeleteMapping("/{customer_Id}")
    public HashMap<?,?> DeleteCustomer(@PathVariable("customer_Id")String customer_Id) {
        HashMap<String,Object> map = new HashMap<>();
        customerService.deleteCustomer(customer_Id);
        map.clear();
        map.put("result","탈퇴 성공");
        return map;
    } 

    @GetMapping("/list")
    public List<CustomerDTO> list(){
        /* List<CustomerDTO> list = new ArrayList<>();
        list = customerService.findCustomers();
        for(CustomerDTO customer : list){
            System.out.println(customer.getCustomer_Id()+" : "
            +customer.getCustomer_Name()+" : "
            +customer.getPassword()+" : "
            +customer.getSsn()+" : "
            +customer.getPhone()+" : "
            +customer.getCity()+" : "
            +customer.getAddress()+" : "
            +customer.getPostalcode());
        } */
        return null;
    }



    
    
    
}