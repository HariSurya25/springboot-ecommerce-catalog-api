package org.example.productcatalogservicedec24.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.productcatalogservicedec24.models.BaseModel;
import org.example.productcatalogservicedec24.models.Category;

@Setter
@Getter
public class ProductDto extends BaseModel {
    public Long id;
    public String name;
    public String description;
    public Double price;
    public CategoryDto cat;
    public String image;

    public void setCategoryDto(CategoryDto cat) {
    }
}
