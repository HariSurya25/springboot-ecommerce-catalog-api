package org.example.productcatalogservicedec24.services;

import org.example.productcatalogservicedec24.dtos.ProductDto;
import org.example.productcatalogservicedec24.models.Product;

import java.util.List;
//interface has abstract methods for loose coupling
public interface IProductService {
    Product getProductById(Long id);
    List<Product> getProductsAll();
}
