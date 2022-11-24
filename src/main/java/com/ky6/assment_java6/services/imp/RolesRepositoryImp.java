package com.ky6.assment_java6.services.imp;


import com.ky6.assment_java6.entities.Roles;
import com.ky6.assment_java6.repositories.RolesRepository;
import com.ky6.assment_java6.services.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class RolesRepositoryImp implements RolesService {
    @Autowired
    RolesRepository rolesRepository;

    @Override
    public List<Roles> findAll() {
        return rolesRepository.findAll();
    }

    @Override
    public List<Roles> findAll(Sort sort) {
        return rolesRepository.findAll(sort);
    }

    @Override
    public List<Roles> findAllById(Iterable<Integer> integers) {
        return rolesRepository.findAllById(integers);
    }

    @Override
    public <S extends Roles> S save(S entity) {
        return rolesRepository.save(entity);
    }

    @Override
    public Optional<Roles> findById(Integer integer) {
        return rolesRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return rolesRepository.existsById(integer);
    }

    @Override
    public long count() {
        return rolesRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        rolesRepository.deleteById(integer);
    }

    @Override
    public void delete(Roles entity) {
        rolesRepository.delete(entity);
    }

    @Override
    public <S extends Roles> boolean exists(Example<S> example) {
        return rolesRepository.exists(example);
    }

    @Override
    public <S extends Roles, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return rolesRepository.findBy(example, queryFunction);
    }
}
