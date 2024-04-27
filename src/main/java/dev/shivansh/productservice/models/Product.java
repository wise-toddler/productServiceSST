package dev.shivansh.productservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product
{
    @Id
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String image;
    @ManyToOne
    private Category category;
    // print the product
    @Override
    public String toString()
    {
        return "Product\n{\n\tid: "+id+"\n\ttitle: "+title+"\n\tdescription: "+description+"\n\tprice: "+price+"\n\timage: "+image+"\n\tcategory: "+category+"\n}";
    }
}