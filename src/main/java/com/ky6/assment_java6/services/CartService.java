package com.ky6.assment_java6.services;

import com.ky6.assment_java6.entities.Cart;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface CartService {
    List<Cart> findAll();

    List<Cart> findAll(Sort sort);

    <S extends Cart> S save(S entity);

    Optional<Cart> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);

    void delete(Cart entity);

    <S extends Cart> long count(Example<S> example);

    <S extends Cart> boolean exists(Example<S> example);
}
