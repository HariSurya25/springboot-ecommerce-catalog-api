package org.example.productcatalogservicedec24.TablesInheritanceExamples.tableperclass;

import jakarta.persistence.Entity;

@Entity(name="tbc_instructor")
public class Instructor extends  User{
    String companyname;
}
