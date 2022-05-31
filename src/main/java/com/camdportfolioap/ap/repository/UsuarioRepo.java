package com.camdportfolioap.ap.repository;

import com.camdportfolioap.ap.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
