package com.breaze.uc_biblioteca.services.impl;

import com.breaze.uc_biblioteca.models.dto.CrearAutorInDTO;
import com.breaze.uc_biblioteca.models.dto.GetAutorOutDTO;
import com.breaze.uc_biblioteca.models.entity.Autor;
import com.breaze.uc_biblioteca.repositories.IAutorRepository;
import com.breaze.uc_biblioteca.services.IAutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AutorService implements IAutorService {
    private final IAutorRepository autorRepository;

    @Override
    public List<Autor> buscarAutores() {
        return this.autorRepository.findAll();
    }

    @Override
    public GetAutorOutDTO buscarAutorPorId(Long id) {
        return this.autorRepository.findById(id).map(this::autorToDTO).orElse(null);
    }

    @Override
    public Autor crearAutor(CrearAutorInDTO crearAutorInDTO) {
        Autor autor = new Autor();
        autor.setNombre(crearAutorInDTO.getNombre());
        autor.setNacionalidad(crearAutorInDTO.getNacionalidad());
        return this.autorRepository.save(autor);
    }

    private GetAutorOutDTO autorToDTO(Autor autor) {
        GetAutorOutDTO dto = new GetAutorOutDTO();
        dto.setNombre(autor.getNombre());
        dto.setNacionalidad(autor.getNacionalidad());
        return dto;
    }


}
