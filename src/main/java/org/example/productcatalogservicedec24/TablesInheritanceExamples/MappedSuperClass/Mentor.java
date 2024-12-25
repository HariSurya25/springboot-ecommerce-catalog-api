package org.example.productcatalogservicedec24.TablesInheritanceExamples.MappedSuperClass;

import jakarta.persistence.Entity;
import org.example.productcatalogservicedec24.TablesInheritanceExamples.tableperclass.User;

@Entity(name="msc_mentor")
public class Mentor extends User {
    double ratings;
}
