package com.dneves.apiNuvem.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dneves.apiNuvem.domain.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
