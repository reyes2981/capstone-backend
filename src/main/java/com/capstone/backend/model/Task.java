package com.capstone.backend.model;

import javax.persistence.*;

@Entity
@Table(name ="tasks")
public class Task {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Primary Key
    private Long id;

    @Column
    private String body;

    @Column
    private Boolean complete;


}
