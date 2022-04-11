package com.bitboxer2prueba.estherzurita.apirest.dao;

import com.bitboxer2prueba.estherzurita.apirest.model.Item;

import java.util.List;

public interface ItemDAO {

    List findAll();

    Item findById(Long id);

    void save(Item item) throws Exception;

    void update(Item item) throws Exception;

    void remove(Long id) throws Exception;
}
