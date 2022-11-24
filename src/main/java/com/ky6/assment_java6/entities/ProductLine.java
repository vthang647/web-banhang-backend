package com.ky6.assment_java6.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;

@Entity
@Table(name = "product_line")
@Getter
@Setter
public class ProductLine {
    @Id
    @Column(name = "id_pl", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPl;

    @Nationalized
    @Column(name = "name_product_line", length = 50)
    private String nameProductLine;

    @Column(name = "status_line")
    private int statusLine;
}
