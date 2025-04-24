package com.ccstudent.jhmusuarioservice.util;

import com.ccstudent.jhmusuarioservice.entity.Usuario;
import com.ccstudent.jhmusuarioservice.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UsuarioSeeder implements CommandLineRunner {

    private final UsuarioRepository usuarioRepository;
    public UsuarioSeeder(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    @Override
    public void run(String... args){
        if (usuarioRepository.count() == 0) {
            Usuario U1 = Usuario.builder()
                    .nombre("Pedro Sánchez")
                    .correo("pedro.sanchez@example.com")
                    .tipoUsuario("estudiante")
                    .estadoUsuario("activo")
                    .carrera("Contabilidad")
                    .build();

            Usuario U2 = Usuario.builder()
                    .nombre("Elvis Romero")
                    .correo("elvis.romero@example.com")
                    .tipoUsuario("docente")
                    .estadoUsuario("activo")
                    .carrera("Sistemas")
                    .build();

            Usuario U3 = Usuario.builder()
                    .nombre("Lucía Pérez")
                    .correo("lucia.perez@example.com")
                    .tipoUsuario("estudiante")
                    .estadoUsuario("inactivo")
                    .carrera("Administración")
                    .build();

            Usuario U4 = Usuario.builder()
                    .nombre("Carlos Ruiz")
                    .correo("carlos.ruiz@example.com")
                    .tipoUsuario("docente")
                    .estadoUsuario("activo")
                    .carrera("Ingeniería Industrial")
                    .build();

            Usuario U5 = Usuario.builder()
                    .nombre("Ana Torres")
                    .correo("ana.torres@example.com")
                    .tipoUsuario("estudiante")
                    .estadoUsuario("activo")
                    .carrera("Marketing")
                    .build();

            usuarioRepository.save(U1);
            usuarioRepository.save(U2);
            usuarioRepository.save(U3);
            usuarioRepository.save(U4);
            usuarioRepository.save(U5);


            System.out.println("Datos de Usuario insertados correctamente.");
        }else {
            System.out.println("Los Usuarios ya existen, no se insertaron datos.");
        }
    }
}
