package com.ky6.assment_java6.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Getter
@Setter
public class Roles {
    @Id
    @Column(name = "id_role", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;

    @Column(name = "code", nullable = false, length = 20)
    private String code;

    @Column(name = "name_role", length = 20)
    private String nameRole;

    @Column(name = "status_role")
    private Integer statusRole;
}
