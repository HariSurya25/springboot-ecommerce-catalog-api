package org.example.productcatalogservicedec24.models;
//base model for all services and its abstract

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public abstract class BaseModel {
    private Long id;
    private Date created_at;
    private Date modified_at;
    private State state;

}
