package com.bitboxer2prueba.estherzurita.apirest.service;

import com.bitboxer2prueba.estherzurita.apirest.model.Supplier;
import com.bitboxer2prueba.estherzurita.apirest.service.dao.SupplierDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    SupplierDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Supplier supplier = userDAO.findByUsername(username);
        if(supplier == null){
            throw new UsernameNotFoundException("User not found with username: "+ username);
        }
        return new User(supplier.getUsername(), supplier.getPassword(),
                new ArrayList<>());
    }
}
