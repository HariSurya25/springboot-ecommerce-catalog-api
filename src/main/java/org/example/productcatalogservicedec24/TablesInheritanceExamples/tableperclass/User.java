package org.example.productcatalogservicedec24.TablesInheritanceExamples.tableperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import java.util.UUID;
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) //type inheritance defined each class has table doing union
@Entity(name = "tbc_user") //entity annoation wcreate table and unique across ur aplication ,db
public class User {
    @Id //primary key
    UUID id; //universal unique identifier>mac adres+epoch time stamp+random num
    String name;
    String email;

}
