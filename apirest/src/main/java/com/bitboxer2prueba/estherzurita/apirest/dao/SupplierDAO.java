package com.bitboxer2prueba.estherzurita.apirest.dao;


import com.bitboxer2prueba.estherzurita.apirest.model.Supplier;

import java.util.List;

public interface SupplierDAO {

    public List<Supplier> findAll();

    public Supplier findById(Long id);

    public Supplier findByUsername(String username);

}
