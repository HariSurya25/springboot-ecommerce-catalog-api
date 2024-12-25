package org.example.productcatalogservicedec24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name="tbcategory")
public class Category extends  BaseModel{
    private String name;
    private String description;
    @OneToMany(mappedBy="category") //cardinality bet prd and cate we explicitly mention field name  ,telling to jpa don't create relationship create twice times
    private List<Product> prd;

}
