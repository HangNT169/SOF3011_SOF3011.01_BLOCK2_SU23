package com.poly.sof3011.hangnt169.B9_CRUDHibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "category")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Category {
    /**
     * Java 3: JDBC (Java Database Connect..)
     * Java 4: Hibernate
     * Java 5: JPA
     * JDBC : Cau truy van cua cac ban (TRUY VAN BANG CAU SQL)
     * Hibernate : Truy van dua tren Thuc The (Entity) => HQL (Hibernate Query Language)
     * ORM(Object Relationship Mapping) : MAPPING GIUA THUC THE (ENTITY) => CLASS TRONG ENTITY VOI DB(SQL)
     *  1 cọt DB:
     *      - khoa chinh
     *      - khoa ngoai
     *      - 1 column binh thuong
     *  nvarchar/varchar => String
     *  int => int/Integer
     *  float => float/Float
     *  bit => boolean/Boolean
     *  bigint => long/Long
     *  uniqueidentifier => String/UUID
     *  ....
     */

    // Khoa chinh
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // column binh thuong trong table
    @Column(name = "category_code")
    private String categoryCode;

    // column binh thuong trong table
    @Column(name = "category_name")
    private String categoryName;

}
