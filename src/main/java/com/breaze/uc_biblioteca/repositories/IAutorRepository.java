package com.breaze.uc_biblioteca.repositories;

import com.breaze.uc_biblioteca.models.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutorRepository extends JpaRepository<Autor, Long> {

}
