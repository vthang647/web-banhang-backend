package com.ky6.assment_java6.repositories;

import com.ky6.assment_java6.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

    @Query(value = "select * from products where name_product like %:keyword%", nativeQuery = true)
    public List<Products> findBynameProduct(@Param("keyword") String keyword);

    @Query(value = "select * from products where id_pl=:idpl", nativeQuery = true)
    public List<Products> findProductByPl(@Param("idpl") String idpl);

    @Query(value = "select * from products where id_pl=:idpl order by price ASC", nativeQuery = true)
    public List<Products> sorfByPriceUP(@Param("idpl") String idpl);

    @Query(value = "select * from products where id_pl=:idpl order by price DESC", nativeQuery = true)
    public List<Products> sorfByPriceDOWN(@Param("idpl") String idpl);

    @Query(value = "select * from products order by price ASC", nativeQuery = true)
    public List<Products> sorfByPriceProductAllUp();

    @Query(value = "select * from products order by price DESC", nativeQuery = true)
    public List<Products> sorfByPriceProductAllDown();
}
