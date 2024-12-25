package org.example.productcatalogservicedec24.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="tbproduct") //entity to create table with name
public class Product extends  BaseModel{
    private String name;
    private String description;
    private String imageUrl;
    private double price;
    @ManyToOne(cascade = CascadeType.ALL)  //cardinality bet tables prd and catgry & cascade repeltion on prd if category not exist with that product then craete cat and store prd
    private Category category;
    private  Boolean isPrime;


}
