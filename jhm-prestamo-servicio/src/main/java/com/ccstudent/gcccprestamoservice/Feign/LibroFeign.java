package com.ccstudent.gcccprestamoservice.Feign;

import com.ccstudent.gcccprestamoservice.Dto.LibroDto;
import com.ccstudent.gcccprestamoservice.Dto.UsuarioDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "gccc-libro-service", path = "/libros")
public interface LibroFeign {
    @GetMapping("{/id}")
    public ResponseEntity<LibroDto> buscarLibro(@PathVariable Long id);

    @FeignClient(name = "gccc-usuario-service", path = "/usuario")
    interface UsuarioFeign {
        @GetMapping("{id}")
        public ResponseEntity<UsuarioDto> buscarUsuario(@PathVariable Long id);

    }
}
