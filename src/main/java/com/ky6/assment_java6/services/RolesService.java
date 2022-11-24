package com.ky6.assment_java6.services;

import com.ky6.assment_java6.entities.Roles;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface RolesService {
    List<Roles> findAll();

    List<Roles> findAll(Sort sort);

    List<Roles> findAllById(Iterable<Integer> integers);

    <S extends Roles> S save(S entity);

    Optional<Roles> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);

    void delete(Roles entity);

    <S extends Roles> boolean exists(Example<S> example);

    <S extends Roles, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
