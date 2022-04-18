package com.bitboxer2prueba.estherzurita.apirest.model;

import lombok.Getter;

import java.util.List;

@Getter
public class JwtResponse {

    private final Integer status;
    private final String token;
    private final List<String> roles;

    public JwtResponse(String token, List roles)
    {
        this.status = ((token != null) && (token.length() != 0)) ? 200 : 204;
        this.token = token;
        this.roles = roles;
    }

}
