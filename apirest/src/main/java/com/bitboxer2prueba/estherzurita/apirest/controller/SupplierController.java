package com.bitboxer2prueba.estherzurita.apirest.controller;

import com.bitboxer2prueba.estherzurita.apirest.model.Item;
import com.bitboxer2prueba.estherzurita.apirest.service.dao.SupplierDAO;
import com.bitboxer2prueba.estherzurita.apirest.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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

    @PreAuthorize("hasRole('ADMIN')")
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

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/savesupplier")
    public String saveSupplier(@RequestBody Supplier supplier){
        try {
            supplierDAO.save(supplier);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "OK";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("removesupplier/{idSupplier}")
    public String removeSupplier(@PathVariable Long idSupplier){
        try{
            supplierDAO.remove(idSupplier);
        }catch(Exception e){
            return e.getMessage();
        }
        return "OK";
    }

}
