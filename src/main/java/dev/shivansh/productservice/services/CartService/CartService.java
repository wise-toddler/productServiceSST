package dev.shivansh.productservice.services.CartService;

import dev.shivansh.productservice.models.Cart;

import java.util.List;
public interface CartService
{
    List<Cart> getAllProducts(Long userId);
    Cart getCart(Long id);
    Cart addNewCart(Cart cart);
    void deleteCart(Long id);
    Cart updateCart(Cart cart);
}
