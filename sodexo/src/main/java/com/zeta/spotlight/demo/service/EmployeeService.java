package com.zeta.spotlight.demo.service;

import com.zeta.spotlight.demo.model.Employee;
import com.zeta.spotlight.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    public Optional<Employee> getEmployeeByEmail(String email) {
        return employeeRepository.findByEmailId(email);
    }

    public Optional<List<Employee>> getAllEmployeesByCorp(Long id) {
        return employeeRepository.findByCorpId(id);
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public int updateEmployee(Integer id, Employee employee) {
        if(employeeRepository.existsById(id)) {
            employeeRepository.save(employee);
            return 1;
        } else {
            return 0;
        }
    }

    public int deleteEmployee(Integer id) {
        if(employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return 1;
        } else {
            return 0;
        }
    }
}
