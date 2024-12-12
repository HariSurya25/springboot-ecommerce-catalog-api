package org.example.productcatalogservicedec24.Controllers;

import org.example.productcatalogservicedec24.models.Product;
import org.example.productcatalogservicedec24.models.State;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController //if we want to create rest api's and json,xml type response format this restcotroller object api called by machine top of spring will mamage dependecies,beans,
//controller has all related apis and input req,response processing and for business logic condition calling productservices
@RequestMapping ("Products/e-commerce")//specify root path
public class ProductController {
   // http://localhost:8082/Products/e-commerce/getproducts
   // http://localhost:8082/getproducts
    //get api,GetMapping -->we can test all get api's through browser
    @GetMapping("/getproducts")
    public List<Product> getAllProducts() {
       Product pr= new Product();
       pr.setId(2L);
       pr.setName("Iphone");
       pr.setDescription("Iphone 16 new version");
       pr.setPrice(50000.00);
       pr.setCreated_at(new Date());
       pr.setModified_at(new Date());
       pr.setState(State.Active);

       List<Product> listproduct= new ArrayList<>();
       listproduct.add(pr);
       return listproduct;

    }

    //get api -->Spring Boot REST API endpoint implemented using the @GetMapping annotation.
    // It is designed to handle HTTP GET requests for retrieving a product by its ID
   // @PathVariable Long prid ->Extracts the value of {productid} from the URL and assigns to the productid variable.@GetMapping("{productid}") represents a dynamic value in the URL.
    @GetMapping("{productid}")
    public Product getProductById(@PathVariable Long productid){
        Product pr= new Product();
        pr.setId(productid);
        return pr;
    }
  //Product object is serialized into JSON or XML by Spring Boot before sending the response to the client.
   //http://localhost:8082/Products/e-commerce/pr?productname=Iphone
    // bind query parameters from a URL to a method parameter in a controller
    @GetMapping("/pr")
    public  Product getProductByName(@RequestParam String productname){
        Product pr= new Product();
        pr.setName(productname);//request param we can pass query parametres extract get results
        return pr;
    }

    //post api-->create new product and saving into db -->Test api thoroughly using Postman
    //Use @RequestBody to map the incoming request's JSON payload to the Java objects
    //@PostMapping--> Maps the HTTP POST request to this method
    /* http://localhost:8082/Products/e-commerce/createproduct
     request-->{
       "id": 10,
        "name": "TV",
        "price": 10999.99,
        "description":"smart tv",
       "state":"Active"
    }
    response-->
    {
    "id": 10,
    "created_at": null,
    "modified_at": null,
    "state": "Active",
    "name": "TV",
    "description": "smart tv",
    "imageUrl": null,
    "price": 10999.99
}*/
    @PostMapping("/createproduct")
    public ResponseEntity<Product> createProduct(@RequestBody Product prd){
       //save to db/jpa/hibernate
        return ResponseEntity.status(HttpStatus.CREATED).body(prd);
    }
}
