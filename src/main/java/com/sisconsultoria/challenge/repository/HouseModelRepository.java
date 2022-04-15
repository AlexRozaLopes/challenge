package com.sisconsultoria.challenge.repository;

import com.sisconsultoria.challenge.model.HouseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseModelRepository extends JpaRepository<HouseModel, Long> {
}