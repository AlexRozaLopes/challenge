package com.sisconsultoria.challenge.service;

import com.sisconsultoria.challenge.model.StudentsModel;
import com.sisconsultoria.challenge.repository.StudentsModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentsService {
    private final StudentsModelRepository studentsModelRepository;

    public List<StudentsModel> findAllStudents() {
        return studentsModelRepository.findAll();
    }
}
