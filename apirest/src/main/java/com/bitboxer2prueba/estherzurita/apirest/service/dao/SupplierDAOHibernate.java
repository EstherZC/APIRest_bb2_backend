package com.bitboxer2prueba.estherzurita.apirest.service.dao;

import com.bitboxer2prueba.estherzurita.apirest.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
/**
 * @author Esther Zurita
 * @version 1.0.0
 */
@Repository
@Transactional
public class SupplierDAOHibernate implements SupplierDAO{

    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Supplier> findAll() {
        String query = "FROM Supplier";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    @Transactional
    public Supplier findById(Long id) {
        return entityManager.find(Supplier.class, id);
    }

    @Override
    @Transactional
    public Supplier findByUsername(String username) {
        String query = "FROM Supplier WHERE username = :username";
        Supplier supplier;
        try{
            supplier = (Supplier) entityManager.createQuery(query).setParameter("username", username).getSingleResult();
        }catch(Exception e){
            supplier = null;
        }
        return supplier;
    }
}
