package dev.shivansh.productservice.Repositories;

import dev.shivansh.productservice.models.Cart;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepo extends JpaRepository<Cart, Long>
{
//    Cart findByUserId(Long userId);
    Cart save(Cart cart);
}
