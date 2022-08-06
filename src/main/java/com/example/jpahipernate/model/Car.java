package com.example.jpahipernate.model;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private int id;

    private String brand;

    private String model;

    private int year;

    private int distance;

    @OneToOne
    private Person owner;

}
