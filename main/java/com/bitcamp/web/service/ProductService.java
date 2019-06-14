package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.ProductDTO;

import org.springframework.stereotype.Component;

@Component
public interface ProductService {

    public void addProduct(ProductDTO product);
    public List<ProductDTO> findProducts();
    public List<ProductDTO> findProductsByOption(String productName);
    public ProductDTO findProductByProductId(String productId);
    public void updateProduct(ProductDTO product);
    public void deleteProduct(String productId);
}