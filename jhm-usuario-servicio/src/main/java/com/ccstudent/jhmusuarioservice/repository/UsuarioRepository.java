package com.ccstudent.jhmusuarioservice.repository;

import com.ccstudent.jhmusuarioservice.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
