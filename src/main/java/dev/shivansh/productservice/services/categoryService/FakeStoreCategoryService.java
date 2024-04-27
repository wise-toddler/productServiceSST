package dev.shivansh.productservice.services.categoryService;

import dev.shivansh.productservice.models.Category;

import java.util.List;

public class FakeStoreCategoryService implements CategoryService
{
    // lol this doesn't exist

    @Override
    public List<String> getAllCategories() {
        return List.of();
    }

    @Override
    public Category getCategoryByName(String categoryName) {
        return null;
    }

    @Override
    public Category addCategory(Category category) {
        return null;
    }

    @Override
    public void deleteCategory(String categoryName) {

    }

    @Override
    public Category getCategoryById(Long id) {
        return null;
    }
}
