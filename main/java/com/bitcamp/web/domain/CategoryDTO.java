package com.bitcamp.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class CategoryDTO {
    private int category_Id;
    private String category_Name,description;
}

