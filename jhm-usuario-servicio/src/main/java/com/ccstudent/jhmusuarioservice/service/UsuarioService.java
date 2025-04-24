package com.ccstudent.jhmusuarioservice.service;

import com.ccstudent.jhmusuarioservice.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> Listar();
    Optional<Usuario> Buscar(Long id);
    Usuario Guardar(Usuario usuario);
    Usuario Modificar(Long id, Usuario usuario);
    void Eliminar(Long id);
}
