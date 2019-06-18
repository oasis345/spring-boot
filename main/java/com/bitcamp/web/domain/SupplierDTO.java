package com.bitcamp.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class SupplierDTO {
    private int supplier_Id;
    private String supplier_Name, contact_Name, address, city, postal_Code, country, phone;
}