package com.sisconsultoria.challenge.controller;

import com.sisconsultoria.challenge.model.StudentsModel;
import com.sisconsultoria.challenge.service.StudentsService;
import com.sisconsultoria.challenge.utils.dto.StudentDto;
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
    public List<StudentDto> getAllStudents(){
        return studentsService.findAllStudents();
    }

    @GetMapping("/{id}")
    @RolesAllowed({"admin","user"})
    public StudentDto getStudent(@PathVariable UUID id){
        return studentsService.findStudentById(id);
    }

    @PostMapping
    @RolesAllowed("admin")
    public void postStudent(@RequestBody StudentsModel studentsModel){
        studentsService.postStudent(studentsModel);
    }

    @DeleteMapping("/{id}")
    @RolesAllowed("admin")
    public void deleteStudent(@PathVariable UUID id) {
        studentsService.deleteById(id);
    }

    @PutMapping("/{id}")
    @RolesAllowed({"admin","user"})
    public StudentsModel putStudent(@PathVariable UUID id, @RequestBody StudentsModel studentsModel) {
        return studentsService.putStudent(id, studentsModel);
    }

}
