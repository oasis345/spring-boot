package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.ProductDTO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ProductMapper {

    public void insertProduct(ProductDTO product);
    public List<ProductDTO> selectProducts();
    public List<ProductDTO> selectProductsByOption(String product_Name);
    public ProductDTO selectProductByProductId(String product_Id);
    public void updateProduct(ProductDTO product);
    public void deleteProduct(String product_Id);
}