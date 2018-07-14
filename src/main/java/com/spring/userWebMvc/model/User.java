package com.spring.userWebMvc.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 *
 * @author stas
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "birth")
    @DateTimeFormat(iso = ISO.DATE)
    private Date birth;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "about")
    private String about;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    public User(String firstname, String lastname, Date birth, String login, String password, String about, String address, String email) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.birth = birth;
        this.login = login;
        this.password = password;
        this.about = about;
        this.address = address;
        this.email = email;
    }

}
