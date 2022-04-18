package com.bitboxer2prueba.estherzurita.apirest.model;

import com.bitboxer2prueba.estherzurita.apirest.enums.UserTypeConverter;
import com.bitboxer2prueba.estherzurita.apirest.enums.UserTypeEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
/**
 * @author Esther Zurita
 * @version 1.0.0
 */
@MappedSuperclass
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(generator = "user_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="user_seq",  schema = "bb2_api", sequenceName = "user_seq", allocationSize = 1)
    @Column(name = "iduser", nullable = false, unique = true)
    private Long idUser;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "type")
    @Convert(converter = UserTypeConverter.class)
    private UserTypeEnum userType;
}
