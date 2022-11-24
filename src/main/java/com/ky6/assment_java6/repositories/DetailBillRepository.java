package com.ky6.assment_java6.repositories;

import com.ky6.assment_java6.entities.DetailBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailBillRepository extends JpaRepository<DetailBill, Integer> {
}
