package com.bitboxer2prueba.estherzurita.apirest.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "supplier", schema = "bb2_api")
public class Supplier {

    @Id
    @GeneratedValue(generator = "supplier_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="supplier_seq", sequenceName = "bb2_api")
    @Column(name = "idsupplier")
    private Long idSupplier;
    private String name;
    private String country;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "iduser", referencedColumnName = "iduser")
    private User user;

    @ManyToMany(mappedBy = "suppliers")
    private Set<Item> items;

    public Long getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Long idSupplier) {
        this.idSupplier = idSupplier;
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
