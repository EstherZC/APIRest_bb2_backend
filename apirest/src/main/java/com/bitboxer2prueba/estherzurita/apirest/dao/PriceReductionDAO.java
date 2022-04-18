package com.bitboxer2prueba.estherzurita.apirest.dao;

import com.bitboxer2prueba.estherzurita.apirest.model.PriceReduction;

import java.util.List;

public interface PriceReductionDAO {

    List findAll();

    PriceReduction findById(Long idReduction);

    void save(PriceReduction priceReduction) throws Exception;
}
