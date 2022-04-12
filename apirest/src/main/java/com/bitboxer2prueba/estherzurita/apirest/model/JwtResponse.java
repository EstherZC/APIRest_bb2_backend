package com.bitboxer2prueba.estherzurita.apirest.model;

public class JwtResponse {

    private final Integer status;
    private final String token;

    public JwtResponse(String token, Integer status)
    {
        this.status = status;
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public Integer getStatus(){
        return status;
    }
}
