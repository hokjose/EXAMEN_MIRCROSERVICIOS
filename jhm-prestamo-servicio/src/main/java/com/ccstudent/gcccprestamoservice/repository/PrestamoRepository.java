package com.ccstudent.gcccprestamoservice.repository;

import com.ccstudent.gcccprestamoservice.entity.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
}
