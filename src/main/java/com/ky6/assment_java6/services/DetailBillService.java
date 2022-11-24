package com.ky6.assment_java6.services;

import com.ky6.assment_java6.entities.DetailBill;
import org.springframework.data.domain.Example;

import java.util.List;
import java.util.Optional;

public interface DetailBillService {
    List<DetailBill> findAll();

    <S extends DetailBill> S save(S entity);

    Optional<DetailBill> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);

    <S extends DetailBill> long count(Example<S> example);

    <S extends DetailBill> boolean exists(Example<S> example);
}
