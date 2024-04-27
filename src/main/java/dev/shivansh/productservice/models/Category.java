package dev.shivansh.productservice.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Data
@Entity
public class Category
{

    private Long id;
    private String title;
    private String description;
    // print the category
    @Override
    public String toString()
    {
        return "Category\n{\n\tid: "+id+"\n\ttitle: "+title+"\n\tdescription: "+description+"\n}";
    }
}

