package com.bitboxer2prueba.estherzurita.apirest.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum UserTypeEnum {

    ADMIN(1, "admin"), SUPPLIER(2, "supplier");

    private final Integer id;
    private final String type;

    UserTypeEnum(Integer id, String type) {
        this.id = id;
        this.type = type;
    }


    public Integer getId() {
        return id;
    }

    @JsonValue
    public String getType() {
        return type;
    }

    public static UserTypeEnum getFromId(Integer id) {
        for(UserTypeEnum e : values()) {
            if(e.id.equals(id))
                return e;
        }
        throw new IllegalArgumentException("El tipo pasado -" + (id==null ? "NULL" : id.toString()) +
                "- no se corresponde con ningún valor del enum UserTypeEnum");
    }
}
