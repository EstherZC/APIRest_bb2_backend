package com.bitboxer2prueba.estherzurita.apirest.controller;

import com.bitboxer2prueba.estherzurita.apirest.model.PriceReduction;
import com.bitboxer2prueba.estherzurita.apirest.service.dao.PriceReductionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Esther Zurita
 * @version 1.0.0
 */
@RestController()
@CrossOrigin
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

    @GetMapping("/findreductions")
    public List<PriceReduction> findPriceReductions(){
        return priceReductionDAO.findAll();
    }


    @GetMapping("/findreductionbyid/{idReduction}")
    public PriceReduction findPriceReductionsById(@PathVariable Long idReduction){
        return priceReductionDAO.findById(idReduction);
    }

}
