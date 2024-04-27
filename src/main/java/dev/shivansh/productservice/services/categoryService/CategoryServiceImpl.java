package dev.shivansh.productservice.services.categoryService;

import dev.shivansh.productservice.Repositories.CategoryRepo;
import dev.shivansh.productservice.models.Category;

import java.util.List;

public class CategoryServiceImpl implements CategoryService
{
    private final CategoryRepo categoryRepo;

    public CategoryServiceImpl(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public List<String> getAllCategories() {
        return categoryRepo.findAll().stream().map(Category::getTitle).toList();
    }

    @Override
    public Category getCategoryByName(String categoryName) {
        return categoryRepo.findByTitle(categoryName).orElse(null);
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
