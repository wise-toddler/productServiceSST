package dev.shivansh.productservice.services.categoryService;

import dev.shivansh.productservice.models.Category;
import java.util.List;

public interface CategoryService {
    public List<String> getAllCategories();

    public Category getCategoryByName(String categoryName);

    public Category addCategory(Category category);

    public void deleteCategory(String categoryName);

    public Category getCategoryById(Long id);
}
