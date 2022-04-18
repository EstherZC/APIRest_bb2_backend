package com.bitboxer2prueba.estherzurita.apirest.service.dao;

import com.bitboxer2prueba.estherzurita.apirest.model.Item;

import java.util.List;
/**
 * @author Esther Zurita
 * @version 1.0.0
 */
public interface ItemDAO {

    List findAll();

    Item findById(Long id);

    List findByState(Boolean active);

    List findByCreator(Long id);

    List findBySupplier(Long id);

    void save(Item item) throws Exception;

    void update(Item item) throws Exception;

    void remove(Long id) throws Exception;
}
