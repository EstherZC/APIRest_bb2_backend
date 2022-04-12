package com.bitboxer2prueba.estherzurita.apirest.controller;

import com.bitboxer2prueba.estherzurita.apirest.dao.PriceReductionDAO;
import com.bitboxer2prueba.estherzurita.apirest.model.PriceReduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author Esther Zurita
 * @version 1.0.0
 */
@RestController()
@RequestMapping("/apiRest")
public class PriceReductionController {

    @Autowired
    PriceReductionDAO priceReductionDAO;

    @PostMapping("/savereduction")
    public String saveReduction(@RequestBody PriceReduction priceReduction){
        try {
            priceReductionDAO.save(priceReduction);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "OK";
    }

    @GetMapping("/findreductionbyid/{idReduction}")
    public PriceReduction findPriceReductions(@PathVariable Long idReduction){
        return priceReductionDAO.findById(idReduction);
    }

}
