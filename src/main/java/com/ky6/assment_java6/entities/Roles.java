package com.ky6.assment_java6.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
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

    @ManyToMany(mappedBy = "roles")
    @JsonIgnore
    private Collection<Staff> stlikes = new ArrayList<>();
}
