package com.bitboxer2prueba.estherzurita.apirest.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * @author Esther Zurita
 * @version 1.0.0
 */
@Entity
@Getter
@Setter
@Table(name = "item", schema = "bb2_api")
public class Item {

    @Id
    @GeneratedValue(generator = "item_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="item_seq", schema = "bb2_api", sequenceName = "item_seq", allocationSize = 1)
    @Column(name = "iditem")
    private Long idItem;
    @Column(name = "itemcode", nullable = false, unique = true)
    private Long itemCode;
    private String description;
    private Double price;
    @Type(type= "org.hibernate.type.NumericBooleanType")
    @Column(name = "state")
    private Boolean state;
    private Date creation;
    @ManyToOne
    @JoinColumn(name = "creator", referencedColumnName = "iduser")
    private Supplier creator;
    @ManyToMany(cascade = {CascadeType.MERGE,
            CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(
            name = "items_suppliers", schema = "bb2_api",
            joinColumns = { @JoinColumn(name = "iditem") },
            inverseJoinColumns = { @JoinColumn(name = "idsupplier") }
    )
    private Set<Supplier> suppliers;
    @ManyToMany(cascade = {CascadeType.MERGE,
            CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(
            name = "items_price_reductions", schema = "bb2_api",
            joinColumns = { @JoinColumn(name = "iditem") },
            inverseJoinColumns = { @JoinColumn(name = "idreduction") }
    )
    private Set<PriceReduction> priceReductions;


    public void addSupplier(Supplier supplier){
        if(suppliers == null){
            suppliers = new HashSet<>();
        }
        if(supplier != null){
            suppliers.add(supplier);
        }
    }

    public void removeSupplier(Supplier supplier){
        if(suppliers != null){
            suppliers.remove(supplier);
        }
    }

    public void addPriceReduction(PriceReduction reduction){
        if(priceReductions ==null){
            priceReductions = new HashSet<>();
        }
        if(reduction != null){
            priceReductions.add(reduction);
        }
    }

}
