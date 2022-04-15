package com.sisconsultoria.challenge.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "students")
@Data
public class StudentsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String name;

}