package com.bitboxer2prueba.estherzurita.apirest.dao;

import com.bitboxer2prueba.estherzurita.apirest.model.PriceReduction;

public interface PriceReductionDAO {

    public PriceReduction findById(Long idReduction);

    public void save(PriceReduction priceReduction) throws Exception;
}
