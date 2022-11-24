package com.ky6.assment_java6.services.imp;


import com.ky6.assment_java6.entities.Products;
import com.ky6.assment_java6.repositories.ProductRepository;
import com.ky6.assment_java6.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ProductRepositoryImp implements ProductService {
    @Autowired
    ProductRepository productRepository;


    @Override
    public List<Products> findAll() {
        return productRepository.findAll();
    }

    public List<Products> findAll(Sort sort) {
        return productRepository.findAll(sort);
    }

    public List<Products> findAllById(Iterable<Long> longs) {
        return productRepository.findAllById(longs);
    }

    public <S extends Products> List<S> saveAll(Iterable<S> entities) {
        return productRepository.saveAll(entities);
    }

    public void flush() {
        productRepository.flush();
    }

    public <S extends Products> S saveAndFlush(S entity) {
        return productRepository.saveAndFlush(entity);
    }

    public <S extends Products> List<S> saveAllAndFlush(Iterable<S> entities) {
        return productRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Products> entities) {
        productRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Products> entities) {
        productRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        productRepository.deleteAllByIdInBatch(longs);
    }

    public void deleteAllInBatch() {
        productRepository.deleteAllInBatch();
    }

    @Deprecated
    public Products getOne(Long aLong) {
        return productRepository.getOne(aLong);
    }

    @Deprecated
    public Products getById(Long aLong) {
        return productRepository.getById(aLong);
    }

    public Products getReferenceById(Long aLong) {
        return productRepository.getReferenceById(aLong);
    }

    public <S extends Products> List<S> findAll(Example<S> example) {
        return productRepository.findAll(example);
    }

    public <S extends Products> List<S> findAll(Example<S> example, Sort sort) {
        return productRepository.findAll(example, sort);
    }

    public Page<Products> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public <S extends Products> S save(S entity) {
        return productRepository.save(entity);
    }

    @Override
    public Optional<Products> findById(Long aLong) {
        return productRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return productRepository.existsById(aLong);
    }

    public long count() {
        return productRepository.count();
    }

    public void deleteById(Long aLong) {
        productRepository.deleteById(aLong);
    }

    public void delete(Products entity) {
        productRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Long> longs) {
        productRepository.deleteAllById(longs);
    }

    public void deleteAll(Iterable<? extends Products> entities) {
        productRepository.deleteAll(entities);
    }

    public void deleteAll() {
        productRepository.deleteAll();
    }

    public <S extends Products> Optional<S> findOne(Example<S> example) {
        return productRepository.findOne(example);
    }

    public <S extends Products> Page<S> findAll(Example<S> example, Pageable pageable) {
        return productRepository.findAll(example, pageable);
    }

    public <S extends Products> long count(Example<S> example) {
        return productRepository.count(example);
    }

    public <S extends Products> boolean exists(Example<S> example) {
        return productRepository.exists(example);
    }

    public <S extends Products, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return productRepository.findBy(example, queryFunction);
    }
}
