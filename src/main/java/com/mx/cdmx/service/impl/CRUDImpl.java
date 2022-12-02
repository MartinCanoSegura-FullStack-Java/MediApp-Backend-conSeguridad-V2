package com.mx.cdmx.service.impl;

import java.util.List;

import com.mx.cdmx.repo.IGenericRepo;
import com.mx.cdmx.service.ICRUD;

/**
 * Operaciones crear, listar, actualizar, eliminar los registros de los.
 * pacientes.
 * 
 * @author Martin Cano
 *
 * @param <T>
 * @param <ID>
 */
public abstract class CRUDImpl<T, ID> implements ICRUD<T, ID> {

    protected abstract IGenericRepo<T, ID> getRepo();

    /**
     * Elimina el registro con el id.
     * 
     * @param id
     */
    @Override
    public void eliminar(final ID id) {
        getRepo().deleteById(id);
    }

    /**
     * Listar registros de pacientes.
     */
    @Override
    public List<T> listar() {
        return getRepo().findAll();
    }

    /**
     * Listar por id los registros de pacientes. id @param. Numero identificador del
     * paciente.
     */
    @Override
    public T listarPorId(final ID id) {
        return getRepo().findById(id).orElse(null);
    }

    /**
     * Modificar el registro del paciente.
     * 
     * @param t
     */
    @Override
    public T modificar(final T t) {
        return getRepo().save(t);
    }

    /**
     * Registrar un nuevo paciente.
     * 
     * @param t
     */
    @Override
    public T registrar(final T t) {
        return getRepo().save(t);
    }

}
