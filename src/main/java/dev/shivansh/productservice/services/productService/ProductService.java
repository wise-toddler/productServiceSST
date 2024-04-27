package dev.shivansh.productservice.services.productService;

import dev.shivansh.productservice.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductbyId(Long id);
    List<Product> getAllProducts();
    String createProduct(Product product);
    Product updateProduct(Product product);
    String deleteProduct(Long id);
    List<Product> getProductsByCategory(String categoryName);
    List<String> getAllCategories();
}
