package com.ky6.assment_java6.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "staffs")
@Getter
@Setter
public class Staff {
    @Id
    @Column(name = "id_staff", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStaff;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_role")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Roles idRole;

    @Column(name = "code", length = 20)
    private String code;

    @Column(name = "name_staff", length = 20)
    private String nameStaff;

    @Column(name = "permanent_address", length = 20)
    private String permanentAddress;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "username")
    private String username;

    @Column(name = "passwd")
    private String passwd;

    @Column(name = "status_staff")
    private Integer statusStaff;
}
