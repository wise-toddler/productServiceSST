package dev.shivansh.productservice.services.CartService;

import dev.shivansh.productservice.models.Cart;
import dev.shivansh.productservice.services.productService.ProductService;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class FakeStoreCartService implements CartService
{

    private final String url = "http://www.fakestoreapi.com/carts";
    private RestTemplate restTemplate;
    private final ProductService productService;

    public FakeStoreCartService(ProductService productService)
    {
        this.productService = productService;
        this.restTemplate = new RestTemplate();
    }

    @Override
    public List<Cart> getAllProducts(Long userId)
    {
        return null;
        // ResponseEntity<List<Cart>> response = restTemplate.exchange(url + "?userId=" + userId, HttpMethod.GET, null, List.class);
    }

    @Override
    public Cart getCart(Long id) {
        return null;
    }

    @Override
    public Cart addNewCart(Cart cart) {
        return null;
    }

    @Override
    public void deleteCart(Long id) {

    }

    @Override
    public Cart updateCart(Cart cart) {
        return null;
    }
}
