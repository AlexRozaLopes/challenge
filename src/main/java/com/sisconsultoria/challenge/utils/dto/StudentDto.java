package com.sisconsultoria.challenge.utils.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class StudentDto {
    private UUID id;
    private String name;
    private String house;
}
