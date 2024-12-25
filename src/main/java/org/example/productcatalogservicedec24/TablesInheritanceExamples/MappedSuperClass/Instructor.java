package org.example.productcatalogservicedec24.TablesInheritanceExamples.MappedSuperClass;

import jakarta.persistence.Entity;
import org.example.productcatalogservicedec24.TablesInheritanceExamples.tableperclass.User;

@Entity(name="msc_instructor")
public class Instructor extends User {
    String companyname;
}
