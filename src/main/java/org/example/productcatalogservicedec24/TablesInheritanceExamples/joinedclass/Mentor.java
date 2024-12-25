package org.example.productcatalogservicedec24.TablesInheritanceExamples.joinedclass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name="jc_mentor")
@PrimaryKeyJoinColumn(name="jc_userid")
public class Mentor extends  User{
    double ratings;
}
