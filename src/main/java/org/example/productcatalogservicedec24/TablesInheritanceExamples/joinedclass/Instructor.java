package org.example.productcatalogservicedec24.TablesInheritanceExamples.joinedclass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name="jc_instructor")
@PrimaryKeyJoinColumn(name="jc_userid") //fk relation to user table
public class Instructor extends User {
    String companyname;

}
