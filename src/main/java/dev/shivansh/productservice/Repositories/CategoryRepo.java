package dev.shivansh.productservice.Repositories;

import dev.shivansh.productservice.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long>
{
    Optional<Category> findByTitle(String title);
}
