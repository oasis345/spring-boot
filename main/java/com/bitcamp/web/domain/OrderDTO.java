package com.bitcamp.web.domain;

import java.util.Date;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class OrderDTO {
    private int order_Id;
    private String customer_Id;
    private int employee_Id;
    private Date order_Date;
    private String shipper_Id;
}