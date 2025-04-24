package com.ccstudent.gcccprestamoservice.service;

import com.ccstudent.gcccprestamoservice.entity.Prestamo;

import java.util.List;

public interface PrestamoService {
    List<Prestamo> Listar();
    Prestamo Buscar(Long id);
    Prestamo Guardar(Prestamo matricula);
    Prestamo Actualizar(Prestamo matricula);
    Prestamo Eliminar(Prestamo matricula);


}
