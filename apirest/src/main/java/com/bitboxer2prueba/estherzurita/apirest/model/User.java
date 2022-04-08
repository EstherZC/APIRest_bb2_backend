package com.bitboxer2prueba.estherzurita.apirest.model;

import javax.persistence.*;

@Entity
@Table(name = "user_information", schema = "bb2_api")
public class User {

    @Id
    @GeneratedValue(generator = "user_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="user_seq", sequenceName = "bb2_api")
    @Column(name = "iduser")
    private Long idUser;
    private String username;
    private String password;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
