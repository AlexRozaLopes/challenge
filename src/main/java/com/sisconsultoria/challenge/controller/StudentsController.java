package com.sisconsultoria.challenge.controller;

import com.sisconsultoria.challenge.model.StudentsModel;
import com.sisconsultoria.challenge.service.StudentsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/students")
@AllArgsConstructor
public class StudentsController {

    private final StudentsService studentsService;

    @GetMapping
    @RolesAllowed("admin")
    public List<StudentsModel> getAllStudents(){
        return studentsService.findAllStudents();
    }

    @GetMapping("/{id}")
    @RolesAllowed({"admin","user"})
    public StudentsModel getStudent(@PathVariable UUID id){
        return studentsService.findStudentById(id);
    }

    @PostMapping
    @RolesAllowed("admin")
    public void postStudent(@RequestBody StudentsModel studentsModel){
        studentsService.postStudent(studentsModel);
    }

}
