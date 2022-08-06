package com.example.jpahipernate.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class IdentityCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String givenName;

    private String surname;

    private String identityNo;

    private char gender;

    private LocalDate birthDay;

    @OneToOne
    private Person person;

}
