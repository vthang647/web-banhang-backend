package com.ky6.assment_java6.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Products {
    @Id
    @Column(name = "id_sp", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pl")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private ProductLine idPl;

    @Column(name = "code", length = 20)
    private String code;

    @Column(name = "name_product", length = 50)
    private String nameProduct;

    @Column(name = "img", length = 200)
    private String img;

    @Column(name = "quatity")
    private Integer quatity;

    @Column(name = "price_import", precision = 20)
    private double priceImport;

    @Column(name = "price", precision = 20)
    private double price;

    @Column(name = "price_after_discount", precision = 20)
    private double priceAfterDiscount;

    @Column(name = "status_product")
    private int statusProduct;
}
