package com.sisconsultoria.challenge.service;

import com.sisconsultoria.challenge.exception.StudentNotFoundException;
import com.sisconsultoria.challenge.model.StudentsModel;
import com.sisconsultoria.challenge.repository.StudentsModelRepository;
import com.sisconsultoria.challenge.utils.dto.StudentDto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentsService {
    private final StudentsModelRepository studentsModelRepository;
    private final ModelMapper modelMapper;

    public List<StudentDto> findAllStudents() {
        return studentsModelRepository.findAll().stream().map(
                studentsModel -> modelMapper.map(studentsModel, StudentDto.class)
        ).collect(Collectors.toList());
    }

    public StudentDto findStudentById(UUID id) {
        StudentsModel studentsModel= studentsModelRepository.
                findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found with this id:" + id));

        return modelMapper.map(studentsModel, StudentDto.class);
    }

    public void postStudent(StudentsModel studentsModel) {
        studentsModelRepository.save(studentsModel);
    }

    public void deleteById(UUID id) {
       studentsModelRepository.
                findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found with this id:" + id));
        studentsModelRepository.deleteById(id);
    }

    public StudentsModel putStudent(UUID id, StudentsModel studentsModel) {
       studentsModelRepository.findById(id).map( student -> {
            student.setName(studentsModel.getName());
            return studentsModelRepository.save(student);
        });
        return studentsModelRepository.save(studentsModel);
    }
}
