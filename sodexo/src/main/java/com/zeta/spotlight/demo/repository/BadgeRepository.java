package com.zeta.spotlight.demo.repository;

import com.zeta.spotlight.demo.model.Badge;
import com.zeta.spotlight.demo.model.Program;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BadgeRepository extends CrudRepository<Badge, Integer> {

    List<Badge> findByProgram(Program program);
}
