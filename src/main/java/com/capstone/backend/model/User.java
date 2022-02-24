package com.capstone.backend.model;

import javax.persistence.*;

@Entity
@Table(name ="user")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Primary Key
    private Long id;

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;

}
