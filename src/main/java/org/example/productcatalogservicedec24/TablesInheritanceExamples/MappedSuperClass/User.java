package org.example.productcatalogservicedec24.TablesInheritanceExamples.MappedSuperClass;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.UUID;
//jugadoo custom inheritance type
@MappedSuperclass //make abstarct class base model to create common fields in another table but base model table nt create
public abstract class User {
    @Id
    UUID id;
    String email;
    String name;
}
