package com.ky6.assment_java6.services;

import com.ky6.assment_java6.entities.Bill;
import org.springframework.data.domain.Example;

import java.util.List;
import java.util.Optional;

public interface BillService {
    List<Bill> findAll();

    <S extends Bill> S save(S entity);

    Optional<Bill> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);

    void delete(Bill entity);

    <S extends Bill> long count(Example<S> example);

    <S extends Bill> boolean exists(Example<S> example);
}
