package org.example.productcatalogservicedec24.TablesInheritanceExamples.MappedSuperClass;

import jakarta.persistence.Entity;
import org.example.productcatalogservicedec24.TablesInheritanceExamples.tableperclass.User;

@Entity(name="msc_ta")
public class TA extends User {
    int helpreq;

}
