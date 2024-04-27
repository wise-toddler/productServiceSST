package dev.shivansh.productservice.services.productService;

import dev.shivansh.productservice.dtos.FakeStoreProductDto;
import dev.shivansh.productservice.exceptions.ProductNotFoundException;
import dev.shivansh.productservice.models.Category;
import dev.shivansh.productservice.models.Product;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
//int num = a[i][j]-'0';
import java.util.List;

@Service
@Primary
public class FakeStoreProductService implements ProductService {

    private final RestTemplate restTemplate;
    private final String url = "https://fakestoreapi.com/products";

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProductbyId(Long id) {
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject(url + "/" + id, FakeStoreProductDto.class);
        if (fakeStoreProductDto == null)
            throw new ProductNotFoundException(id, "Product with id " + id + " not found");
        return convertToProduct(fakeStoreProductDto);
    }

    @SuppressWarnings("null")
    @Override
    public List<Product> getAllProducts() {
        FakeStoreProductDto[] fakeStoreProductDtos = restTemplate.getForObject("https://fakestoreapi.com/products",
                FakeStoreProductDto[].class);
        List<Product> products = new java.util.ArrayList<>();
        assert fakeStoreProductDtos != null;
        for (FakeStoreProductDto fakeStoreProductDto : fakeStoreProductDtos) {
            products.add(convertToProduct(fakeStoreProductDto));
        }
        return products;
    }

    private Product convertToProduct(FakeStoreProductDto fakeStoreProductDto) {
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice()); //
        product.setDescription(fakeStoreProductDto.getDescription());

        Category category = new Category();
        category.setTitle(fakeStoreProductDto.getCategory());
        product.setCategory(category);
        product.setImage(fakeStoreProductDto.getImage());
        return product;
    }

    @Override
    public String createProduct(Product product) {
        Product response = restTemplate.postForObject(url, product, Product.class);
        return "Product created successfully \n" + response;
    }

    @Override
    public Product updateProduct(Product product) {
        restTemplate.put(url + "/" + product.getId(), product);
        return product;
    }

    @Override
    public String deleteProduct(Long id) {
        // deleting the product at the given id
        Product product = getProductbyId(id);
        restTemplate.delete(url + "/" + id);
        return "Product deleted successfully \n" + product;
    }

    @SuppressWarnings("null")
    @Override
    public List<Product> getProductsByCategory(String categoryName) {
        FakeStoreProductDto[] fakeStoreProductDtos = restTemplate.getForObject(url, FakeStoreProductDto[].class);
        List<Product> products = new java.util.ArrayList<>();
        assert fakeStoreProductDtos != null;
        for (FakeStoreProductDto fakeStoreProductDto : fakeStoreProductDtos) {
            if (fakeStoreProductDto.getCategory().equals(categoryName)) {
                products.add(convertToProduct(fakeStoreProductDto));
            }
        }
        return products;
    }

    @Override
    public List<String> getAllCategories() {
        return List.of();
    }
}
