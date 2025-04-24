package com.ccstudent.gcccprestamoservice.controller;

import com.ccstudent.gcccprestamoservice.entity.Prestamo;
import com.ccstudent.gcccprestamoservice.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestamo")
public class PrestamoController {
    @Autowired
    public PrestamoService prestamoService;

    @GetMapping
    public ResponseEntity<List<Prestamo>> Listar(){
        return new ResponseEntity<>(prestamoService.Listar(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prestamo> Buscar(@PathVariable Long id){
        Prestamo prestamo = prestamoService.Buscar(id);
        if (prestamo != null) {
            return new ResponseEntity<>(prestamo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Prestamo> Guardar(@RequestBody Prestamo prestamo){
        Prestamo nuevoPrestamo = prestamoService.Guardar(prestamo);
        return new ResponseEntity<>(nuevoPrestamo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Prestamo> Actualizar(@PathVariable Long id, @RequestBody Prestamo prestamo){
        Prestamo prestamoExistente = prestamoService.Buscar(id);
        if (prestamoExistente != null) {
            prestamo.setId(id);
            Prestamo prestamiActualizada = prestamoService.Actualizar(prestamo);
            return new ResponseEntity<>(prestamiActualizada, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        Prestamo prestamoAEliminar = new Prestamo();
        prestamoAEliminar.setId(id);
        prestamoService.Eliminar(prestamoAEliminar);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

