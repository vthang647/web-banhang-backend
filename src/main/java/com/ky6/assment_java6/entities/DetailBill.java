package com.ky6.assment_java6.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "detail_bill")
@Getter
@Setter
public class DetailBill {
    @Id
    @Column(name = "id_detail_bill", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetailBill;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bill")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Bill idBill;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sp")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Products idSp;

    @Column(name = "quatity")
    private int quatity;
    
    @Column(name = "amount_price")
    private BigDecimal amountPrice;
}
