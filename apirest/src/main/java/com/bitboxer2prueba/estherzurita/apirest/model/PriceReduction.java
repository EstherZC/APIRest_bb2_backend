package com.bitboxer2prueba.estherzurita.apirest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
/**
 * @author Esther Zurita
 * @version 1.0.0
 */
@Entity
@Getter
@Setter
@Table(name = "price_reduction", schema = "bb2_api")
public class PriceReduction {

    @Id
    @GeneratedValue(generator = "price_reduction_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="price_reduction_seq", schema = "bb2_api", sequenceName = "price_reduction_seq", allocationSize = 1)
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

}
