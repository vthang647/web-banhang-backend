package com.ky6.assment_java6.services;

import com.ky6.assment_java6.entities.ProductLine;

import java.util.List;
import java.util.Optional;

public interface ProductLineService {
    List<ProductLine> findAll();

    <S extends ProductLine> S save(S entity);

    Optional<ProductLine> findById(Long aLong);

    boolean existsById(Long aLong);

    void deleteById(Long aLong);
}
