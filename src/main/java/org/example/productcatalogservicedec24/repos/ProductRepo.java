package org.example.productcatalogservicedec24.repos;

import org.example.productcatalogservicedec24.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//prdrepo has custom repo for prdct table to access all functions from jpa extends of hibernate in orm concept
@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {

}
