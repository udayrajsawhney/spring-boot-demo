package com.zeta.spotlight.demo.controller;

import com.zeta.spotlight.demo.model.Employee;
import com.zeta.spotlight.demo.model.LoginDetails;
import com.zeta.spotlight.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AuthenticationController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/login")
    public Employee authenticateUser(@RequestBody LoginDetails loginDetails) {
        String email = loginDetails.getEmail();
        Optional<Employee> employee = employeeService.getEmployeeByEmail(email);
        return employee.flatMap(value -> employee).orElseGet(Employee::new);
    }
}
