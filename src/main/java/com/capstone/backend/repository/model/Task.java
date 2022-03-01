package com.capstone.backend.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tasks")
public class Task {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Primary Key
    private Long id;

    @Column
    private String body;

    @Column
    private Boolean complete;

    @Column
    private Long numofpomos;
}
