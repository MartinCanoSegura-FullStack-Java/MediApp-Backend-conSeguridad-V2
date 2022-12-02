package com.mx.cdmx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.cdmx.model.Paciente;
import com.mx.cdmx.service.IPacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private IPacienteService service;

    /**
     * Listar todos los registros de los pacientes.
     * 
     * @return una lista paginable de los pacientes
     */
    @GetMapping
    public ResponseEntity<List<Paciente>> listar() {
        List<Paciente> lPacientes = service.listar();
        return new ResponseEntity<List<Paciente>>(lPacientes, HttpStatus.OK);
    }

}
