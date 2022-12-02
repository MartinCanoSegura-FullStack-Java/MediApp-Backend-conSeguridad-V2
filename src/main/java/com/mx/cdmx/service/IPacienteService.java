package com.mx.cdmx.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mx.cdmx.model.Paciente;

public interface IPacienteService extends ICRUD<Paciente, Integer> {

    Page<Paciente> listarPageable(Pageable pageable);

}
