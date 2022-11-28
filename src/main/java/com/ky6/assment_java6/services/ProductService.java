package com.ky6.assment_java6.services;

import com.ky6.assment_java6.entities.Products;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    @Query(value = "select * from products where name_product like %:keyword%", nativeQuery = true)
    List<Products> findBynameProduct(String keyword);

    @Query(value = "select * from products where id_pl=:idPl order by id_sp DESC", nativeQuery = true)
    List<Products> findProductByPl(String idpl);

    @Query(value = "select * from products where id_pl=:idpl order by price ASC", nativeQuery = true)
    List<Products> sorfByPriceUP(String idpl);

    @Query(value = "select * from products where id_pl=:idpl order by price DESC", nativeQuery = true)
    List<Products> sorfByPriceDOWN(String idpl);

    @Query(value = "select * from products order by price ASC", nativeQuery = true)
    List<Products> sorfByPriceProductAllUp();

    @Query(value = "select * from products order by price DESC", nativeQuery = true)
    List<Products> sorfByPriceProductAllDown();

    List<Products> findAll();

    @Deprecated
    Products getById(Integer integer);

    <S extends Products> S save(S entity);

    Optional<Products> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);
}
