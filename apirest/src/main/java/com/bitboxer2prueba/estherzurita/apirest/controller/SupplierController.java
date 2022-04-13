package com.bitboxer2prueba.estherzurita.apirest.controller;

import com.bitboxer2prueba.estherzurita.apirest.service.dao.SupplierDAO;
import com.bitboxer2prueba.estherzurita.apirest.model.Supplier;
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
public class SupplierController {

    @Autowired
    SupplierDAO supplierDAO;

    @GetMapping("/findsuppliers")
    public List<Supplier> findAllSuppliers(){
        return supplierDAO.findAll();
    }

    @GetMapping("/findsupplierbyid/{iduser}")
    public Supplier findSupplierByID(@PathVariable Long iduser){
        return supplierDAO.findById(iduser);
    }

    @GetMapping("/findsupplierbyusername/{username}")
    public Supplier findSupplierByUsername(@PathVariable String username){
        return supplierDAO.findByUsername(username);
    }

}
