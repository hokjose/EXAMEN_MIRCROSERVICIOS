package com.jhmtudent.jhmlibroservice.repository;

import com.jhmtudent.jhmlibroservice.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
