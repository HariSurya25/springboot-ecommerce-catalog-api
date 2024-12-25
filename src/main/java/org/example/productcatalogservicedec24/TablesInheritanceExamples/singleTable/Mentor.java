package org.example.productcatalogservicedec24.TablesInheritanceExamples.singleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name="st_mentor")
@DiscriminatorValue("20")
public class Mentor extends User {
    double ratings;
}
