package com.bitboxer2prueba.estherzurita.apirest.dao;

import com.bitboxer2prueba.estherzurita.apirest.model.PriceReduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
public class PriceReductionDAOHibernate implements PriceReductionDAO{

    @Autowired
    EntityManager entityManager;

    @Override
    public List findAll() {
        String query = "FROM PriceReduction";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    @Transactional
    public PriceReduction findById(Long idReduction) {
        String query = "FROM PriceReduction WHERE idReduction = :id";
        PriceReduction priceReduction;
        try{
            priceReduction = (PriceReduction) entityManager.createQuery(query).setParameter("id", idReduction).getSingleResult();
        }catch(Exception e){
            priceReduction = null;
        }
        return priceReduction;
    }

    @Override
    @Transactional
    public void save(PriceReduction priceReduction) throws Exception {
        try{
            entityManager.persist(priceReduction);
        }catch(Exception e){
            throw new Exception("ERROR::PriceReductionDAOHibernate::save(PriceReduction priceReduction) - Exception: "+ e.getMessage());
        }
    }
}
