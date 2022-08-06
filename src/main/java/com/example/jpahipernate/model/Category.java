package com.example.jpahipernate.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "category")
@Entity
public class Category extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_gen")
    @SequenceGenerator(name = "product_gen", sequenceName = "product_seq", initialValue = 1111102, allocationSize = 13)
    private Long id;

    @Column(name = "product_name", length = 100, nullable = false)
    private String name;

}
