package org.example.productcatalogservicedec24.clients;

import jakarta.annotation.Nullable;
import org.example.productcatalogservicedec24.dtos.FakeStoreProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;
@Component
public class FakeStoreApiClient {
    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    public FakeStoreProductDto getProductById(Long productId) {
        ResponseEntity<FakeStoreProductDto> responseEntity = requestForEntity("http://fakestoreapi/products/{productId}", HttpMethod.GET, null, FakeStoreProductDto.class, productId);
//just we are requesting forEntity it wil get response here and than validate response
        return validateFakeStoreResponse(responseEntity);
    }
//parsing req,response format
    public <T> ResponseEntity<T> requestForEntity(String url,HttpMethod httpmethod,@Nullable Object req, Class<T> responseType,Object... uriVaribles){
             RestTemplate restemplate = restTemplateBuilder.build();
             // restTemplateBuilder.rootUri("http://fakestoreapi");
             //parsing object to json, vise versa using objectmapper in resttemplate
             //need to valiadte based on resonse entity status code succes than eturn body
             RequestCallback reqcallback = restemplate.httpEntityCallback(req,responseType);
             ResponseExtractor<ResponseEntity<T>> responseExtractor=restemplate.responseEntityExtractor(responseType);
            return  restemplate.execute(url,httpmethod,reqcallback,responseExtractor,uriVaribles);

    }
//validating response here
    private FakeStoreProductDto validateFakeStoreResponse(ResponseEntity<FakeStoreProductDto> fakeStoreProductDtoResponseEntity) {
        if(fakeStoreProductDtoResponseEntity.getStatusCode().equals(HttpStatusCode.valueOf(200))
                && fakeStoreProductDtoResponseEntity.getBody() != null) {
            return fakeStoreProductDtoResponseEntity.getBody();
        }
        return null;
    }
}
