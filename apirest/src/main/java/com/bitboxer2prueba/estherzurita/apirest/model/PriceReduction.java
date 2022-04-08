package com.bitboxer2prueba.estherzurita.apirest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "price_reduction", schema = "bb2_api")
public class PriceReduction {

    @Id
    @GeneratedValue(generator = "price_reduction_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="price_reduction_seq", sequenceName = "bb2_api")
    @Column(name = "idreduction")
    private Long idReduction;
    @Column(name = "pricereduction")
    private Double priceReduction;
    @Temporal(TemporalType.DATE)
    @Column(name = "startdate")
    private Date startDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "enddate")
    private Date endDate;
    @ManyToMany(mappedBy = "priceReductions")
    @JsonIgnore
    private Set<Item> items;

    public Long getIdReduction() {
        return idReduction;
    }

    public void setIdReduction(Long idReduction) {
        this.idReduction = idReduction;
    }

    public Double getPriceReduction() {
        return priceReduction;
    }

    public void setPriceReduction(Double priceReduction) {
        this.priceReduction = priceReduction;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
