package com.breaze.uc_biblioteca.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAutorOutDTO {
    private String nombre;
    private String nacionalidad;
}
