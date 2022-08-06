package com.example.jpahipernate.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;

    private String  email;

    private String phone;

    private Date startedDate;

    @OneToOne
    private IdentityCard identityCard;

    @OneToOne
    private Car vehicle;
}
