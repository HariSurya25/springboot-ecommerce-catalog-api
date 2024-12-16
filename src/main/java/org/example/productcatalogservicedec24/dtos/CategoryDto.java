package org.example.productcatalogservicedec24.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.productcatalogservicedec24.models.BaseModel;
import org.example.productcatalogservicedec24.models.Product;

import java.util.List;
@Getter
@Setter
public class CategoryDto extends  BaseModel {
        private  Long id;
        private String name;
        private String description;

}
