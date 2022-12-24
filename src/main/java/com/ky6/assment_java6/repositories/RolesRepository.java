package com.ky6.assment_java6.repositories;

import com.ky6.assment_java6.entities.Roles;
import com.ky6.assment_java6.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {
    @Query(value = "select * from roles where name_role like %:nameRole%", nativeQuery = true)
    public Roles findByRoleName(@Param("nameRole") String nameRole);
}
