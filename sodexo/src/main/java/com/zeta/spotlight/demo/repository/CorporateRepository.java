package com.zeta.spotlight.demo.repository;

import com.zeta.spotlight.demo.model.Corporate;
import org.springframework.data.repository.CrudRepository;

public interface CorporateRepository extends CrudRepository<Corporate, Integer> {
}
