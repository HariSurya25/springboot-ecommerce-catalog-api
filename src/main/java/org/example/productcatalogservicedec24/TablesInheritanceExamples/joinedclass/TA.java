package org.example.productcatalogservicedec24.TablesInheritanceExamples.joinedclass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name="jc_ta")
@PrimaryKeyJoinColumn(name="jc_userid")
public class TA extends  User{
    int helpreq;
}
