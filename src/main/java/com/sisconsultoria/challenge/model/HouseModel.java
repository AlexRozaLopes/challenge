package com.sisconsultoria.challenge.model;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "house")
@Data
public class HouseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String houseName;



}