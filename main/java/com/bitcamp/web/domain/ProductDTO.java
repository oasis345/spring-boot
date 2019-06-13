package com.bitcamp.web.domain;

import lombok.Data;

/**
 * ProductDTO
 */
@Data
public class ProductDTO {
    private String productId,
                    productName,
                    supplierId,
                    categoryId,
                    unit,
                    price,
                    photo;
    
}