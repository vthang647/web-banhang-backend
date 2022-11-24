package com.ky6.assment_java6.repositories;

import com.ky6.assment_java6.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffsRepository extends JpaRepository<Staff, Integer> {
}
