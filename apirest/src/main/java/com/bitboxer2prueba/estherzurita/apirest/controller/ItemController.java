package com.bitboxer2prueba.estherzurita.apirest.controller;


import com.bitboxer2prueba.estherzurita.apirest.dao.ItemDAO;
import com.bitboxer2prueba.estherzurita.apirest.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/apiRest")
public class ItemController {

    @Autowired
    ItemDAO itemDAO;


    @GetMapping("/finditems")
    public List<Item> findItems(){
        return itemDAO.findAll();
    }

    @PostMapping("/saveitem")
    public String saveItem(@RequestBody Item item){
        try {
            itemDAO.save(item);
        } catch (Exception e) {
           return e.getMessage();
        }
        return "OK";
    }

    @PutMapping("/updateitem")
    public String updateItem(@RequestBody Item item){
        try{
            itemDAO.update(item);
        }catch(Exception e){
            return e.getMessage();
        }
        return "OK";
    }

    @DeleteMapping("removeitem/id/{idItem}")
    public String removeItem(@PathVariable Long idItem){
        try{
            itemDAO.remove(idItem);
        }catch(Exception e){
            return e.getMessage();
        }
        return "OK";
    }

}
