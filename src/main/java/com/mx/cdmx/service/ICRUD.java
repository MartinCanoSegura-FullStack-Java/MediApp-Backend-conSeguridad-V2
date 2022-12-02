package com.mx.cdmx.service;

import java.util.List;

public interface ICRUD<T, ID> {

    void eliminar(ID id);

    List<T> listar();

    T listarPorId(ID id);

    T modificar(T t);

    T registrar(T t);

}
