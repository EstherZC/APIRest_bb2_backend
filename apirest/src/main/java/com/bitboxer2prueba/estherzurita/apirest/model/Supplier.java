package com.bitboxer2prueba.estherzurita.apirest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "supplier", schema = "bb2_api")
public class Supplier extends User{

    @Column(name = "name")
    private String name;
    @Column(name = "country")
    private String country;

    @ManyToMany(mappedBy = "suppliers")
    @JsonIgnore
    private Set<Item> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
