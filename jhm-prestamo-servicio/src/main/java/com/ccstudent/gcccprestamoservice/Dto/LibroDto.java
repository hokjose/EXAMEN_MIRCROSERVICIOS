package com.ccstudent.gcccprestamoservice.Dto;

import lombok.Data;

@Data
public class LibroDto {
    private Integer id;
    private String titulo;
    private String autor;
    private String editorial;
    private Integer copiasDisponibles;
    private String categoria;
}
