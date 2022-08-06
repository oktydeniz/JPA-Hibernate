package com.example.jpahipernate.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "products")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_gen")
    @SequenceGenerator(name = "product_gen", sequenceName = "product_seq", initialValue = 1111102, allocationSize = 13)
    private Long id;

    @Column(name = "product_name", length = 100, nullable = false)
    private String name;

    @Column(name = "product_stock", nullable = false)
    private String stock;

    @Column(name = "product_price", nullable = false, precision = 5, scale = 2)
    private BigDecimal price;

    @Lob //buyuk veri islenebilir
    @Column(name = "product_description")
    private String description;

    @Enumerated(EnumType.ORDINAL) // default deger int seklinde tutar
    private Rating ratingOrdinal = Rating.STANDARD;

    @Enumerated(EnumType.STRING) // 0,1 gibi enum sirasi yerine String degerler ekler
    private Rating ratingStr = Rating.PREMIUM;

    @Convert(converter = ColorConverter.class) //Enum degerlerini degistirme isine yarar  tek tek eklenebilir bu
    //satira ozel ya da @Nonverter eklenerek her yerde yapilabilir bu tabloya ozel olmaz
    private Color product_color ;

    @Lob
    private byte[] image;

    @Transient // entity icince olsun ama db de olmasin
    private byte[] imageContent;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Product product = (Product) o;
        return id != null && Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
