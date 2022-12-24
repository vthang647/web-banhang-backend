package com.ky6.assment_java6.repositories;

import com.ky6.assment_java6.entities.Products;
import com.ky6.assment_java6.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffsRepository extends JpaRepository<Staff, Integer> {
    @Query(value = "select * from staffs where username like %:username%", nativeQuery = true)
    public Staff findByUsername(@Param("username") String username);
}
