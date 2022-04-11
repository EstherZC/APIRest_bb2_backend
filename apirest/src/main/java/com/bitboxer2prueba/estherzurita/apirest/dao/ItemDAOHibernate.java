package com.bitboxer2prueba.estherzurita.apirest.dao;


import com.bitboxer2prueba.estherzurita.apirest.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public class ItemDAOHibernate implements ItemDAO{

    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Item> findAll() {
        String query = "FROM Item";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    @Transactional
    public Item findById(Long id) {
        String query = "FROM Item WHERE idItem = :id";
        Item item;
        try{
            item = (Item) entityManager.createQuery(query).setParameter("id", id).getSingleResult();
        }catch(Exception e){
            item = null;
        }
        return item;
    }

    @Override
    @Transactional
    public List<Item> findByState(Boolean active) {
        String query = "FROM Item WHERE state = :active";
        return entityManager.createQuery(query).setParameter("active", active).getResultList();
    }

    @Override
    @Transactional
    public void save(Item item) throws Exception {
        checkItem(item);
        item.setState(true);
        item.setCreation(new Date());
        entityManager.persist(item);
    }

    private void checkItem(Item item) throws Exception {
        if(item == null || item.getItemCode() == null){
            throw new Exception("ERROR::ItemDAOHibernate::save(Item item) - Invalid Item");
        }

        if(item.getCreator() == null || item.getCreator().getIdUser() == null){
            throw new Exception("ERROR::ItemDAOHibernate::save(Item item) - The creator don't exits");
        }
    }
    @Override
    @Transactional
    public void update(Item item) throws Exception{
        checkItem(item);
        if(item.getIdItem() == null){
            throw new Exception("ERROR::ItemDAOHibernate::update(Item item) - Invalid Item");
        }
        updateItem(item);
        entityManager.flush();
    }

    @Override
    @Transactional
    public void remove(Long id) throws Exception {
        Item removeItem;
        if(id != null){
            removeItem = findById(id);
        }else{
            throw new Exception("ERROR::ItemDAOHibernate::remove(Long idItem) - Invalid idItem");
        }
        if( removeItem != null){
            entityManager.remove(removeItem);
        }else{
            throw new Exception("ERROR::ItemDAOHibernate::remove(Long idItem) - Not exits Item with id = "+ id);
        }
    }

    private void updateItem(Item item) throws Exception {
        Item update = findById(item.getIdItem());
        if(update != null) {
            update.setState(item.getState());
            update.setDescription(item.getDescription());
            update.setPrice(item.getPrice());
            update.setPriceReductions(item.getPriceReductions());
            update.setSuppliers(item.getSuppliers());
        }else{
            throw new Exception("ERROR::ItemDAOHibernate::update(Item item) - Not exit Item with id = "+ item.getIdItem());
        }
    }


}
