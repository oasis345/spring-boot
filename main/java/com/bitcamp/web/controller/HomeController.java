package com.bitcamp.web.controller;

import java.util.List;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.serviceImpl.CustomerServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    CustomerServiceImpl customerService;

    @RequestMapping("/")
    public String index() {

        List<CustomerDTO> test = customerService.findCustomers();

        for (int i = 0; i < test.size(); i++){
            System.out.println(test.get(i).customer_Name());
        }

        System.out.println("------------------------------------");
         for (CustomerDTO p : customerService.findCustomers()){
           System.out.println(p.customer_Name());
        }

        return "index";
    }

}