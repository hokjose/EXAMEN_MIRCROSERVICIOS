package com.ccstudent.gcccprestamoservice.service.Impl;

import com.ccstudent.gcccprestamoservice.entity.Prestamo;
import com.ccstudent.gcccprestamoservice.repository.PrestamoRepository;
import com.ccstudent.gcccprestamoservice.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PrestamoServiceImpl implements PrestamoService {
    @Autowired
    private PrestamoRepository prestamoRepository;

    @Override
    public List<Prestamo> Listar(){
        return prestamoRepository.findAll();
    }

    @Override
    public Prestamo Buscar(Long id){
        Optional<Prestamo> mprestamoOptional = prestamoRepository.findById(id);
        return null;
    }

    @Override
    public Prestamo Guardar(Prestamo prestamo){
        return prestamoRepository.save(prestamo);
    }

    @Override
    public Prestamo Actualizar(Prestamo prestamo){
        return prestamoRepository.save(prestamo);
    }

    @Override
    public Prestamo Eliminar(Prestamo prestamo){
        prestamoRepository.delete(prestamo);
        return prestamo;
    }


}
