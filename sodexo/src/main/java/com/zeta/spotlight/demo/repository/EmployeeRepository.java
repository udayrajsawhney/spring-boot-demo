package com.zeta.spotlight.demo.repository;

import com.zeta.spotlight.demo.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    Optional<List<Employee>> findByCorpId(Long id);

    Optional<Employee> findByEmailId(String email);
}
