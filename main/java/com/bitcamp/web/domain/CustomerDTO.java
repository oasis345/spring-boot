package com.bitcamp.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class CustomerDTO {
    private String customer_Id;
    private String customer_Name;
    private String passworssn;
    private String phone;
    private String city;
    private String address;
    private String postalcode;
    private String photo;

    public String customer_Name(){
        return customer_Name;
    }

}