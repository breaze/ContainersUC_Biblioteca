package com.breaze.uc_biblioteca.services;

import com.breaze.uc_biblioteca.models.dto.CrearAutorInDTO;
import com.breaze.uc_biblioteca.models.dto.GetAutorOutDTO;
import com.breaze.uc_biblioteca.models.entity.Autor;

import java.util.List;
import java.util.Optional;

public interface IAutorService {
    List<Autor> buscarAutores();
    GetAutorOutDTO buscarAutorPorId(Long id);
    Autor crearAutor(CrearAutorInDTO crearAutorInDTO);
}
