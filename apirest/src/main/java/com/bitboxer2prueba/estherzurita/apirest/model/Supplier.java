package com.bitboxer2prueba.estherzurita.apirest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
/**
 * @author Esther Zurita
 * @version 1.0.0
 */
@Entity
@Getter
@Setter
@Table(name = "supplier", schema = "bb2_api")
public class Supplier extends User{

    @Column(name = "name")
    private String name;
    @Column(name = "country")
    private String country;
    @ManyToMany(mappedBy = "suppliers")
    @JsonIgnore
    private Set<Item> items;

}
