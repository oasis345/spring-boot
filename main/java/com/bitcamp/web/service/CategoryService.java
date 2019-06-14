package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.CategoryDTO;

import org.springframework.stereotype.Component;

@Component
public interface CategoryService {

    public void addCategory(CategoryDTO category);
    public List<CategoryDTO> findCategories();
    public List<CategoryDTO> findCategoriesByOption(String categoryName);
    public CategoryDTO FindCategoryByCategoryId(String categoryId);
    public void updateCategory(CategoryDTO category);
    public void deleteCategory(String categoryId);
}