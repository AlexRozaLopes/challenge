package com.sisconsultoria.challenge.controller;

import com.sisconsultoria.challenge.model.StudentsModel;
import com.sisconsultoria.challenge.service.StudentsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/students")
@AllArgsConstructor
public class StudentsController {

    private final StudentsService studentsService;

    @GetMapping
    public List<StudentsModel> getAllStudents(){
        return studentsService.findAllStudents();
    }

}
