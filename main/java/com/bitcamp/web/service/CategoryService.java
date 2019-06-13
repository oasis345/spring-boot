package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.CategoryDTO;

import org.springframework.stereotype.Component;

/**
 * CategoryService
 */

@Component
public interface CategoryService {

    public void addCategory(CategoryDTO category);
    public List<CategoryDTO> findCategories();
    public List<CategoryDTO> findCategoriesByOption(CategoryDTO category);
    public CategoryDTO FindCategoryByCategoryId(String category);
    public void updateCategory(CategoryDTO category);
    public void deleteCategory(CategoryDTO category);
}