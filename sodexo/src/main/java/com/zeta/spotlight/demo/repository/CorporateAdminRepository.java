package com.zeta.spotlight.demo.repository;

import com.zeta.spotlight.demo.model.CorporateAdmin;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CorporateAdminRepository extends CrudRepository<CorporateAdmin, Integer> {

    Optional<CorporateAdmin> findByEmail(String email);
}
