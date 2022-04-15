package com.sisconsultoria.challenge.service;

import com.sisconsultoria.challenge.model.StudentsModel;
import com.sisconsultoria.challenge.repository.StudentsModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class StudentsService {
    private final StudentsModelRepository studentsModelRepository;

    public List<StudentsModel> findAllStudents() {
        return studentsModelRepository.findAll();
    }

    public StudentsModel findStudentById(UUID id) {
        return studentsModelRepository.
                findById(id).orElseThrow(() -> new RuntimeException("Student not found with this id:" + id));
    }

    public void postStudent(StudentsModel studentsModel) {
        studentsModelRepository.save(studentsModel);
    }
}
