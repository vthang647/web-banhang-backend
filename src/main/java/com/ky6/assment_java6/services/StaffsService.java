package com.ky6.assment_java6.services;

import com.ky6.assment_java6.entities.Staff;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface StaffsService {


    Staff findByUsername(String username);

    void deleteById(Integer integer);

    List<Staff> findAll();

    List<Staff> findAll(Sort sort);

    List<Staff> findAllById(Iterable<Integer> integers);

    <S extends Staff> S save(S entity);

    Optional<Staff> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    <S extends Staff> boolean exists(Example<S> example);
}
