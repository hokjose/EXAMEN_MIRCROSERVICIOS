package com.ccstudent.jhmusuarioservice.service.Impl;

import com.ccstudent.jhmusuarioservice.entity.Usuario;
import com.ccstudent.jhmusuarioservice.repository.UsuarioRepository;
import com.ccstudent.jhmusuarioservice.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository kr;

    @Override
    public List<Usuario> Listar() {
        return kr.findAll();
    }

    @Override
    public Optional<Usuario> Buscar(Long id) {
        return kr.findById(id);
    }

    @Override
    public Usuario Guardar(Usuario usuario) {
        return kr.save(usuario);
    }

    @Override
    public Usuario Modificar(Long id, Usuario usuario) {
        usuario.setId(id);
        return kr.save(usuario);
    }

    @Override
    public void Eliminar(Long id) {
        kr.deleteById(id);
    }

}
