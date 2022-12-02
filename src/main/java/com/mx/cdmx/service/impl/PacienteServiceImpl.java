package com.mx.cdmx.service.impl;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mx.cdmx.model.Paciente;
import com.mx.cdmx.repo.IGenericRepo;
import com.mx.cdmx.repo.IPacienteRepo;
import com.mx.cdmx.service.IPacienteService;

@Service
public class PacienteServiceImpl extends CRUDImpl<Paciente, Integer> implements IPacienteService {

    @Autowired
    private IPacienteRepo repo;

    /**
     * Obtiene la referencia al repositorio.
     */
    @Override
    protected IGenericRepo<Paciente, Integer> getRepo() {
        return repo;
    }

    /**
     * La lista paginable de pacientes.
     */
    @Override
    public Page<Paciente> listarPageable(final Pageable pageable) {
        List<Paciente> pacientes = repo.findAll();

        final int start = (int) pageable.getOffset();
        final int end = Math.min(start + pageable.getPageSize(), pacientes.size());

        Comparator<Paciente> byIdPaciente = (Paciente p1, Paciente p2) -> p1.getIdPaciente()
                .compareTo(p2.getIdPaciente());
        pacientes.sort(byIdPaciente);

        return new PageImpl<>(pacientes.subList(start, end), pageable, pacientes.size());
    }

}
