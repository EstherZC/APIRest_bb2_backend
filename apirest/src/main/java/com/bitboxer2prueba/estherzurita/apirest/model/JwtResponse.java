package com.bitboxer2prueba.estherzurita.apirest.model;

public class JwtResponse {

    private final Integer status;
    private final String token;

    public JwtResponse(String token)
    {
        this.status = (token != null || token.length() != 0) ? 200 : 204 ;
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public Integer getStatus(){
        return status;
    }

}
