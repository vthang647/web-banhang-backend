package com.ky6.assment_java6.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bill")
@Getter
@Setter
public class Bill {
    @Id
    @Column(name = "id_bill", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBill;

    @Column(name = "code", length = 20)
    private String code;

    @Column(name = "time_stamp")
    private Date timeStamp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_customer")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Customers idCustomer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_staff")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Staff idStaff;

    @Column(name = "address_dilivery")
    private String addressDilivery;

    @Column(name = "status_bill")
    private Integer statusBill;
}
