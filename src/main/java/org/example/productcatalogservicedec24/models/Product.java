package org.example.productcatalogservicedec24.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends  BaseModel{
    private String name;
    private String description;
    private String imageUrl;
    private double price;


}
