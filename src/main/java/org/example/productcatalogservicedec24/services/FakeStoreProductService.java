package org.example.productcatalogservicedec24.services;

import lombok.Getter;
import lombok.Setter;
import org.example.productcatalogservicedec24.clients.FakeStoreApiClient;
import org.example.productcatalogservicedec24.dtos.FakeStoreProductDto;
import org.example.productcatalogservicedec24.models.Category;
import org.example.productcatalogservicedec24.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SuppressWarnings("ALL")

//TODO : Rearrange code to Client layer
@Service
//we need to achive di or loose coupling via interaface this ethod called by interaface at controller
public class FakeStoreProductService implements  IProductService{
     @Autowired
     private RestTemplateBuilder restTemplateBuilder;
     @Autowired
     private FakeStoreApiClient fakeStoreApiClient;
     //getprd api business logic here internally fecthing giving tocontrooller through interface
     public Product getProductById(Long productId) {
         //we are calling 3rd party api from serviec layer that is fakestoreapi here so,using resttempleate
         //resttempleatebuilder for copy ofs same objects
         FakeStoreProductDto fakeprddto= fakeStoreApiClient.getProductById(productId);
         if(fakeprddto!=null) {
             return from(fakeprddto);//return object mapper convertion
         }
         return null;
     }

    @Override
    public List<Product> getProductsAll() {
        return List.of();
    }

    //object mapper custom from object to object
     public Product from(FakeStoreProductDto fakestdto) {
         Product product = new Product();
         product.setId(fakestdto.getId());
         product.setDescription(fakestdto.getDescription());
         product.setPrice(fakestdto.getPrice());
         product.setImageUrl(fakestdto.getImage());
         product.setName(fakestdto.getTitle());

         Category cat = new Category();
         cat.setName(fakestdto.getTitle());
         product.setCategory(cat);
         return product;

     }

}
