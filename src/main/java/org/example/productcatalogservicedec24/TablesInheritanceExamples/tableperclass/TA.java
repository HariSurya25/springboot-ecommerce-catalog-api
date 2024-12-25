package org.example.productcatalogservicedec24.TablesInheritanceExamples.tableperclass;

import jakarta.persistence.Entity;

@Entity(name="tbc_ta")
public class TA extends User{
    int helpreq;

}
