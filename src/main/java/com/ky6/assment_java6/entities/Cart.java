package com.ky6.assment_java6.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cart")
@Getter
@Setter
public class Cart {
    @Id
    @Column(name = "id_card", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCard;

    @Column(name = "code", nullable = false)
    private String code;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sp")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Products idSp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_customer")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Products idCustomer;
}
