package com.zeta.spotlight.demo.repository;

import com.zeta.spotlight.demo.model.Program;
import org.springframework.data.repository.CrudRepository;

public interface ProgramRepository extends CrudRepository<Program, Integer> {
}
