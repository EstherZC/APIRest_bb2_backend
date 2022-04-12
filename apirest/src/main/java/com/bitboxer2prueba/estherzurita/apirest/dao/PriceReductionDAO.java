package com.bitboxer2prueba.estherzurita.apirest.dao;

import com.bitboxer2prueba.estherzurita.apirest.model.PriceReduction;
/**
 * @author Esther Zurita
 * @version 1.0.0
 */
public interface PriceReductionDAO {

    public PriceReduction findById(Long idReduction);

    public void save(PriceReduction priceReduction) throws Exception;
}
