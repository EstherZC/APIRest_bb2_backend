package com.bitboxer2prueba.estherzurita.apirest.service.dao;

import com.bitboxer2prueba.estherzurita.apirest.model.Item;
import com.bitboxer2prueba.estherzurita.apirest.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.security.KeyException;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author Esther Zurita
 * @version 1.0.1
 */
@Repository
@Transactional
public class SupplierDAOHibernate implements SupplierDAO{

    @Autowired
    EntityManager entityManager;

    @Autowired
    ItemDAO itemDAO;


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

    @Override
    @Transactional
    public void save(Supplier supplier) throws Exception {
        checkItem(supplier);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode(supplier.getPassword());
        supplier.setPassword(encode);
        entityManager.persist(supplier);
    }

    private void checkItem(Supplier supplier) throws Exception {
        if(supplier == null || supplier.getUsername() == null || supplier.getPassword() == null ){
            throw new Exception("ERROR::SupplierDAOHibernate::save(Supplier supplier) - Invalid Supplier");
        }

        if(supplier.getIdUser() != null){
            throw new Exception("ERROR::ItemDAOHibernate::save(Supplier supplier) - The supplier already exits");
        }
    }
    @Override
    @Transactional
    public void remove(Long id) throws Exception {
        Supplier supplier = this.findById(id);
        if(supplier != null){
            //Delete all items created by supplier
            List<Item> byCreator = itemDAO.findByCreator(id);
            for (Item item : byCreator ) {
                itemDAO.remove(item.getIdItem());
            }
            //Remove supplier relation with Items that supplied
            List<Item> bySupplier = itemDAO.findBySupplier(id);

            for (Item item : bySupplier ) {
                item.removeSupplier(supplier);
            }
            //Remove supplier
            entityManager.remove(supplier);
        }else{
            throw new Exception("ERROR::SupplierDAOHibernate::remove(Long idSupplier) - Not exits Supplier with id = "+ id);
        }
    }
}
