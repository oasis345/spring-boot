package com.bitcamp.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class ShipperDTO {
    private String shipper_Id;
    private String pshipper_Name;
    private String phone;
}