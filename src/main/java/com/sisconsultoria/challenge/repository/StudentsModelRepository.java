package com.sisconsultoria.challenge.repository;

import com.sisconsultoria.challenge.model.StudentsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentsModelRepository extends JpaRepository<StudentsModel, UUID> {
}