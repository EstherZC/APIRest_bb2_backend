package com.bitboxer2prueba.estherzurita.apirest.service.dao;


import com.bitboxer2prueba.estherzurita.apirest.model.Supplier;

import java.security.KeyException;
import java.util.List;
/**
 * @author Esther Zurita
 * @version 1.0.0
 */
public interface SupplierDAO {

    List<Supplier> findAll();

    Supplier findById(Long id);

    Supplier findByUsername(String username);

    void save(Supplier supplier) throws Exception;

    void remove(Long id) throws Exception;
}
