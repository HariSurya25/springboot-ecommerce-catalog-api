package org.example.productcatalogservicedec24.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.productcatalogservicedec24.models.Category;
@Getter
@Setter
public class FakeStoreProductDto {
    public Long id;
    public String title;
    public String description;
    public Double price;
    public String image;
    public Category cat;
    public String rating;

}
