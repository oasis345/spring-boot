package com.bitcamp.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class EmployeeDTO {
    private int employee_Id;
    private String manager;
    private String name;
    private String birthDate;
    private String photo;
    private String notes;
}