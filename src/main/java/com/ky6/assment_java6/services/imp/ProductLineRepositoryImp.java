package com.ky6.assment_java6.services.imp;

import com.ky6.assment_java6.entities.ProductLine;
import com.ky6.assment_java6.repositories.ProductLineRepository;
import com.ky6.assment_java6.services.ProductLineService;
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
public class ProductLineRepositoryImp implements ProductLineService {
    @Autowired
    ProductLineRepository productLineRepository;

    @Override
    public List<ProductLine> findAll() {
        return productLineRepository.findAll();
    }

    public List<ProductLine> findAll(Sort sort) {
        return productLineRepository.findAll(sort);
    }

    public List<ProductLine> findAllById(Iterable<Long> longs) {
        return productLineRepository.findAllById(longs);
    }

    public <S extends ProductLine> List<S> saveAll(Iterable<S> entities) {
        return productLineRepository.saveAll(entities);
    }

    public void flush() {
        productLineRepository.flush();
    }

    public <S extends ProductLine> S saveAndFlush(S entity) {
        return productLineRepository.saveAndFlush(entity);
    }

    public <S extends ProductLine> List<S> saveAllAndFlush(Iterable<S> entities) {
        return productLineRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<ProductLine> entities) {
        productLineRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<ProductLine> entities) {
        productLineRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        productLineRepository.deleteAllByIdInBatch(longs);
    }

    public void deleteAllInBatch() {
        productLineRepository.deleteAllInBatch();
    }

    @Deprecated
    public ProductLine getOne(Long aLong) {
        return productLineRepository.getOne(aLong);
    }

    @Deprecated
    public ProductLine getById(Long aLong) {
        return productLineRepository.getById(aLong);
    }

    public ProductLine getReferenceById(Long aLong) {
        return productLineRepository.getReferenceById(aLong);
    }

    public <S extends ProductLine> List<S> findAll(Example<S> example) {
        return productLineRepository.findAll(example);
    }

    public <S extends ProductLine> List<S> findAll(Example<S> example, Sort sort) {
        return productLineRepository.findAll(example, sort);
    }

    public Page<ProductLine> findAll(Pageable pageable) {
        return productLineRepository.findAll(pageable);
    }

    @Override
    public <S extends ProductLine> S save(S entity) {
        return productLineRepository.save(entity);
    }

    @Override
    public Optional<ProductLine> findById(Long aLong) {
        return productLineRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return productLineRepository.existsById(aLong);
    }

    public long count() {
        return productLineRepository.count();
    }

    @Override
    public void deleteById(Long aLong) {
        productLineRepository.deleteById(aLong);
    }

    public void delete(ProductLine entity) {
        productLineRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Long> longs) {
        productLineRepository.deleteAllById(longs);
    }

    public void deleteAll(Iterable<? extends ProductLine> entities) {
        productLineRepository.deleteAll(entities);
    }

    public void deleteAll() {
        productLineRepository.deleteAll();
    }

    public <S extends ProductLine> Optional<S> findOne(Example<S> example) {
        return productLineRepository.findOne(example);
    }

    public <S extends ProductLine> Page<S> findAll(Example<S> example, Pageable pageable) {
        return productLineRepository.findAll(example, pageable);
    }

    public <S extends ProductLine> long count(Example<S> example) {
        return productLineRepository.count(example);
    }

    public <S extends ProductLine> boolean exists(Example<S> example) {
        return productLineRepository.exists(example);
    }

    public <S extends ProductLine, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return productLineRepository.findBy(example, queryFunction);
    }
}
