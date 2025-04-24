package com.ccstudent.gcccprestamoservice.entity;

import com.ccstudent.gcccprestamoservice.Dto.LibroDto;
import com.ccstudent.gcccprestamoservice.Dto.UsuarioDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prestamo")
    private Long id;

    private Integer cicloPrestamo;

    @CreationTimestamp
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaPrestamo;


    private Long libroId;
    @Transient
    private LibroDto libro;

    private Long usuarioId;
    @Transient
    private UsuarioDto usuario;
}
