package com.ky6.assment_java6.services;

import com.ky6.assment_java6.entities.Products;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Products> findAll();

    @Deprecated
    Products getById(Integer integer);

    <S extends Products> S save(S entity);

    Optional<Products> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);
}
