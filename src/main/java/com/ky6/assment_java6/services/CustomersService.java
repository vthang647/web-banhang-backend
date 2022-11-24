package com.ky6.assment_java6.services;

import com.ky6.assment_java6.entities.Customers;
import org.springframework.data.domain.Example;

import java.util.List;
import java.util.Optional;

public interface CustomersService {
    List<Customers> findAll();

    <S extends Customers> S save(S entity);

    Optional<Customers> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);

    void delete(Customers entity);

    <S extends Customers> long count(Example<S> example);

    <S extends Customers> boolean exists(Example<S> example);
}
