package com.ky6.assment_java6.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customers")
@Getter
@Setter
public class Customers {
    @Id
    @Column(name = "id_customer", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCustomer;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "name_customer")
    private String nameCustomer;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "nick_name", length = 32)
    private String nickName;

    @Column(name = "passwd", length = 100)
    private String passwd;

    @Column(name = "status_customer")
    private Integer statusCustomer;
}
