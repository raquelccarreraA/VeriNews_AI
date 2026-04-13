package com.verinews.backend.repositories;

import com.verinews.backend.models.SolicitudAnalisis;
import com.verinews.backend.models.Usuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudAnalisisRepository extends JpaRepository<SolicitudAnalisis, Long> {

    //buscar por usuario
    List<SolicitudAnalisis> findByUsuario(Usuario usuario);
}
