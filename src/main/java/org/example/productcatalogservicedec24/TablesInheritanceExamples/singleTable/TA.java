package org.example.productcatalogservicedec24.TablesInheritanceExamples.singleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name="st_ta")
public class TA extends User {
    int helpreq;

}
