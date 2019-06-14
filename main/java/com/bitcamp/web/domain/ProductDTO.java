package com.bitcamp.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class ProductDTO {
    private int product_Id;
    private String product_Name;
    private int supplier_Id;
    private int category_Id;
    private String unit;
    private int price;
    private String photo;
}