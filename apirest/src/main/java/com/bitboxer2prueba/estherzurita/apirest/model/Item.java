package com.bitboxer2prueba.estherzurita.apirest.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "supplier", schema = "bb2_api")
public class Item {

    @Id
    @GeneratedValue(generator = "item_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="item_seq", sequenceName = "bb2_api")
    @Column(name = "iditem")
    private Long idItem;
    @Column(name = "itemcode", nullable = false, unique = true)
    private Long itemCode;
    private String description;
    private Double price;
    @Type(type= "org.hibernate.type.NumericBooleanType")
    @Column(name = "state", nullable = false)
    private Boolean state;
    private Date creation;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "creator", referencedColumnName = "iduser")
    private User creator;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "items_suppliers", schema = "bb2_api",
            joinColumns = { @JoinColumn(name = "itemcode") },
            inverseJoinColumns = { @JoinColumn(name = "idsupplier") }
    )
    private Set<Supplier> suppliers;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "price_reductions", schema = "bb2_api",
            joinColumns = { @JoinColumn(name = "itemcode") },
            inverseJoinColumns = { @JoinColumn(name = "idreduction") }
    )
    private Set<PriceReduction> priceReductions;

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public Long getItemCode() {
        return itemCode;
    }

    public void setItemCode(Long itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Set<Supplier> getSuppliers() {
        return suppliers;
    }

    public void addSupplier(Supplier supplier){
        if(suppliers == null){
            suppliers = new HashSet<>();
        }
        if(supplier != null){
            suppliers.add(supplier);
        }
    }

    public void setSuppliers(Set<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public Set<PriceReduction> getPriceReductions() {
        return priceReductions;
    }

    public void addPriceReduction(PriceReduction reduction){
        if(priceReductions ==null){
            priceReductions = new HashSet<>();
        }
        if(reduction != null){
            priceReductions.add(reduction);
        }
    }

    public void setPriceReductions(Set<PriceReduction> priceReductions) {
        this.priceReductions = priceReductions;
    }


}