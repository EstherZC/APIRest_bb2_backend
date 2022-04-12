package com.bitboxer2prueba.estherzurita.apirest.service.dao;

import com.bitboxer2prueba.estherzurita.apirest.model.PriceReduction;
/**
 * @author Esther Zurita
 * @version 1.0.0
 */
public interface PriceReductionDAO {

    PriceReduction findById(Long idReduction);

    void save(PriceReduction priceReduction) throws Exception;
}
