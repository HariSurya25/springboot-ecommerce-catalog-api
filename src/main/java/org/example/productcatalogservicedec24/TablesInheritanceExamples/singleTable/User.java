package org.example.productcatalogservicedec24.TablesInheritanceExamples.singleTable;

import jakarta.persistence.*;

import java.util.UUID;
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //type inheritance defined single table for all feilds
@Entity(name = "st_user") //entity annoation wcreate table and unique across ur aplication ,db
@DiscriminatorColumn(name="user_type", discriminatorType = DiscriminatorType.INTEGER) //when you want to declare all other fileds or tables into single table so,keep it as usertpe of mentor,ta as String datatype
public class User {
    @Id //primary key
    UUID id; //universal unique identifier>mac adres+epoch time stamp+random num
    String name;
    String email;

}
