package com.ky6.assment_java6.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;

import javax.persistence.*;

@Entity
@Table(name = "store")
@Getter
@Setter
public class Store {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_store")
    private String nameStore;

    @Column(name = "status_store")
    private int statusStore;
}
