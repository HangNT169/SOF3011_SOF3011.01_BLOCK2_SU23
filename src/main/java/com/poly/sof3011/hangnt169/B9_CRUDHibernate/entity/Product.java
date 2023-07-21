package com.poly.sof3011.hangnt169.B9_CRUDHibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hangnt
 */
@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "price")
    private Float price;

    @Column(name = "description")
    private String description;

    // Khoa ngoai : MAPPING 2 CHIEU :
    // PRODUCT: MANY TO ONE
    // CATEGORY : ONE TO MANY
    // MANY TO MANY
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private Category category;
    /**
     * Trong Hibernate co 2 loai fetch
     *  + fetch LAZY : => CAN THI MOI LAY RA
     *  + fetch EAGER: => KHONG CAN CUNG LAY => TOC DO SE CHAM HON LAZY
     *  DEFAULT MANY TO ONE => FETCH EAGER
     *  DEFAULT ONE TO MANY => FETCH LAZY
     */
}
