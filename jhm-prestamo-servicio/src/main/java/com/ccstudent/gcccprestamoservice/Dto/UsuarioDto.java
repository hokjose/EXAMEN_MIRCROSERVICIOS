package com.ccstudent.gcccprestamoservice.Dto;

import lombok.Data;

@Data
public class UsuarioDto {
    private Long id;
    private String nombre;
    private String tipo;
    private String estado;
    private String carrera;
}
