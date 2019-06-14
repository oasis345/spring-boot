package com.bitcamp.web.serviceImpl;

import java.util.List;

import com.bitcamp.web.domain.CategoryDTO;
import com.bitcamp.web.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Override
    public void addCategory(CategoryDTO category) {

    }

    @Override
    public List<CategoryDTO> findCategories() {
        return null;
    }

    @Override
    public List<CategoryDTO> findCategoriesByOption(String categoryName) {
        return null;
    }

    @Override
    public CategoryDTO FindCategoryByCategoryId(String categoryId) {
        return null;
    }

    @Override
    public void updateCategory(CategoryDTO category) {

    }

    @Override
    public void deleteCategory(String categoryId) {

    }


}