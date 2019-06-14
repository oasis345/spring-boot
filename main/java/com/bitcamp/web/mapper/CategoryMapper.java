package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.CategoryDTO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CategoryMapper {
    public void insertCategory(CategoryDTO category);
    public List<CategoryDTO> selectCategories();
    public List<CategoryDTO> selectCategoriesByOption(String category_Name);
    public CategoryDTO selectCategoryByCategoryId(String category_Id);
    public void updateCategory(CategoryDTO category);
    public void deleteCategory(String category_Id);
}