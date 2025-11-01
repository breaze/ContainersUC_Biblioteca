package com.breaze.uc_biblioteca.controllers;

import com.breaze.uc_biblioteca.models.dto.CrearAutorInDTO;
import com.breaze.uc_biblioteca.models.dto.GetAutorOutDTO;
import com.breaze.uc_biblioteca.models.entity.Autor;
import com.breaze.uc_biblioteca.repositories.IAutorRepository;
import com.breaze.uc_biblioteca.services.IAutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro")
@RequiredArgsConstructor
public class LibroController {

    private final IAutorService autorService;

    @GetMapping("/obtener_todos")
    public ResponseEntity<List<Autor>> obtenerTodos() {
        return ResponseEntity.ok(this.autorService.buscarAutores());
    }
    @GetMapping("/{id}")
    public ResponseEntity<GetAutorOutDTO> obtenerPorId(@PathVariable Long id) {
        GetAutorOutDTO aut = this.autorService.buscarAutorPorId(id);
        return (aut!=null)?ResponseEntity.ok(aut):ResponseEntity.notFound().build();
    }

    @PostMapping("/crear_autor")
    public ResponseEntity<Autor> crearAutor(@RequestBody CrearAutorInDTO crearAutorInDTO){
        return ResponseEntity.ok(this.autorService.crearAutor(crearAutorInDTO));
    }
}
