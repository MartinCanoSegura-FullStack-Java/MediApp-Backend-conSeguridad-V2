package com.mx.cdmx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.mx.cdmx.utils.Constantes;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * Paciente. Define las propiedades del objeto como entidad y objeto en la base.
 * de datos
 * 
 * @author Martin Cano
 *
 */
@Getter
@Setter
@Schema(description = "Paciente Model")
@Entity
@Table
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPaciente;

    @Schema(description = "nombres del paciente")
    @Size(min = Constantes.CUATRO, max = Constantes.SETENTA, message = "{nombres.size}")
    @Column(name = "nombres", nullable = false, length = Constantes.SETENTA)
    private String nombres;

    @Schema(description = "apelldos del paciente")
    @Size(min = Constantes.CUATRO, max = Constantes.SETENTA, message = "{apellidos.size}")
    @Column(name = "apellidos", nullable = false, length = Constantes.SETENTA)
    private String apellidos;

    @Schema(description = "rfc del paciente")
    @Size(min = Constantes.TRECE, max = Constantes.TRECE, message = "{rfc.size}")
    @Column(name = "dni", nullable = false, length = Constantes.TRECE)
    private String rfc;

    @Schema(description = "domicilio del paciente")
    @Size(min = Constantes.CUATRO, max = Constantes.CIENTO_CINCUENTA, message = "{rfc.size}")
    @Column(name = "domicilio", nullable = true, length = Constantes.CIENTO_CINCUENTA)
    private String domicilio;

    @Schema(description = "Telefono debe tener 10 digitos")
    @Size(min = Constantes.DIEZ, max = Constantes.DIEZ, message = "{telefono.size}")
    @Column(name = "telefono", nullable = true, length = Constantes.DIEZ)
    private String telefono;

    @Schema(description = "email no cumple el formato")
    @Size(min = Constantes.QUINCE, max = Constantes.SESENTA, message = "{email.format}")
    @Column(name = "email", nullable = true, length = Constantes.SESENTA)
    @Email
    private String email;

}
