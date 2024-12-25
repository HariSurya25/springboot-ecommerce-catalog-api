package org.example.productcatalogservicedec24.TablesInheritanceExamples.tableperclass;

import jakarta.persistence.Entity;

@Entity(name="tbc_mentor")
public class Mentor extends User{
    double ratings;
}
