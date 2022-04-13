package com.bitboxer2prueba.estherzurita.apirest.enums;


import javax.persistence.AttributeConverter;
import javax.persistence.Convert;

@Convert
public class UserTypeConverter implements AttributeConverter<UserTypeEnum, Integer> {
    @Override
    public Integer convertToDatabaseColumn(UserTypeEnum userTypeEnum) {
        return (userTypeEnum != null) ? userTypeEnum.getId() : null;
    }

    @Override
    public UserTypeEnum convertToEntityAttribute(Integer id) {
        return (id != null) ? UserTypeEnum.getFromId(id) : null;
    }
}
