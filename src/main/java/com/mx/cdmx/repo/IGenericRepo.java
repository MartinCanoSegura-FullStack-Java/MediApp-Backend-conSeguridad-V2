package com.mx.cdmx.repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenericRepo<T, ID> extends JpaRepository<T, ID> {

}
