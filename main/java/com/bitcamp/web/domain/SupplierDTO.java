package com.bitcamp.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class SupplierDTO {
    private int supplier_Id;
    private String supplier_Name;
    private String contact_Name;
    private String address;
    private String city;
    private String postal_Code;
    private String country;
    private String phone;
}