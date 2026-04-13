package com.verinews.backend.repositories;

import com.verinews.backend.models.ResultadoAnalisis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultadoAnalisisRepository extends JpaRepository<ResultadoAnalisis, Long> {
}