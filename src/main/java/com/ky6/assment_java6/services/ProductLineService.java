package com.ky6.assment_java6.services;

import com.ky6.assment_java6.entities.ProductLine;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface ProductLineService {

    List<ProductLine> findAll();

    <S extends ProductLine> S save(S entity);

    Optional<ProductLine> findById(Integer integer);

    boolean existsById(Integer integer);

    void deleteById(Integer integer);
}
