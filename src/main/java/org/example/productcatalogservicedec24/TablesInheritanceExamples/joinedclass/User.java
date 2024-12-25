package org.example.productcatalogservicedec24.TablesInheritanceExamples.joinedclass;

import jakarta.persistence.*;

import java.util.UUID;

@Inheritance(strategy = InheritanceType.JOINED) //type is joined inheritance means->coomon fields for one table and for other tables,we are using usr id as fk in another tables
@Entity(name="jc_user")
@PrimaryKeyJoinColumn(name="jc_userid")
public class User {
    @Id //primary key
    UUID id;
    String email;
}
