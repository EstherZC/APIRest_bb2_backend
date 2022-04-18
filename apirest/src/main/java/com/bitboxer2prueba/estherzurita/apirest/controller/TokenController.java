package com.bitboxer2prueba.estherzurita.apirest.controller;


import com.bitboxer2prueba.estherzurita.apirest.model.JwtResponse;
import com.bitboxer2prueba.estherzurita.apirest.model.User;
import com.bitboxer2prueba.estherzurita.apirest.utils.JwtProvicer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/authenticated")
public class TokenController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtProvicer tokenProvider;

    @PostMapping("/token")
    public ResponseEntity<JwtResponse> authenticateUser(@RequestBody User login) {
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(login.getUsername(), login.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = tokenProvider.generateToken(authentication);

        return ResponseEntity.ok(new JwtResponse(jwt,  getRoleAuthorization(authentication)));
    }

    private List getRoleAuthorization(Authentication authentication) {
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        Iterator<? extends GrantedAuthority> iterator = authorities.iterator();
        List<String> roles =new ArrayList<>();
        while(iterator.hasNext()){
            roles.add(iterator.next().getAuthority());
        }
        return roles;
    }
}
