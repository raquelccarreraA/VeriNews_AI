package com.verinews.backend.repositories;

import com.verinews.backend.models.Usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    boolean existsByUsername(String username);

    boolean existsByNombre(String nombre);

    Usuario findByNombre(String nombre);

    Optional<Usuario> findByUsername(String username);
}