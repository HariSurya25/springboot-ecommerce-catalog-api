package org.example.productcatalogservicedec24.models;
//base model for all services and its abstract

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
@MappedSuperclass  //means it will not create table for basemodel class rather than it will allow thses fileds to create in another tables
public abstract class BaseModel {
    @Id //primary key  and we can use uuid-->universaly unique identifier -->mac address+epoch timestamp+random num
    private Long id;
    private Date created_at;
    private Date modified_at;
    private State state;

}
