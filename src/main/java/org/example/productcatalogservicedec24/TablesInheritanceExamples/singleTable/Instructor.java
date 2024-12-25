package org.example.productcatalogservicedec24.TablesInheritanceExamples.singleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name="st_instructor")
public class Instructor extends User {
    String companyname;
}
