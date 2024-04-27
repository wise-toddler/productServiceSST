package dev.shivansh.productservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity; // Import the necessary package for @Entity annotation
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Cart
{
    @Id
    private Long id;
    private Long userId;
    private String date;
    @OneToMany
    private List<Product> products;
}
