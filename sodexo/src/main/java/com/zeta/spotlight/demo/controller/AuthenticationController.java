package com.zeta.spotlight.demo.controller;

import com.zeta.spotlight.demo.model.CorporateAdmin;
import com.zeta.spotlight.demo.model.Employee;
import com.zeta.spotlight.demo.model.LoginDetails;
import com.zeta.spotlight.demo.service.AuthenticationService;
import com.zeta.spotlight.demo.service.CorporateAdminService;
import com.zeta.spotlight.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import java.util.HashMap;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CorporateAdminService corporateAdminService;

    @PostMapping("/login")
    public Employee authenticateUser(@RequestBody LoginDetails loginDetails) {
        String email = loginDetails.getEmail();
        Optional<Employee> employee = employeeService.getEmployeeByEmail(email);
        return employee.flatMap(value -> employee).orElseGet(Employee::new);
    }

    @PostMapping("/login/admin")
    public ResponseEntity<Object> authenticateAdmin(@RequestBody LoginDetails loginDetails) {
        String email = loginDetails.getEmail();
        Optional<CorporateAdmin> admin = corporateAdminService.getCorporateAdmin(email);
        HashMap<String, String> data = new HashMap<>();
        return admin.map(value -> {
            HttpHeaders headers = new HttpHeaders();
            headers.add("admin_token", authenticationService.getAdminToken());
            return new ResponseEntity<Object>(admin.get(), headers, HttpStatus.FOUND);
        }).orElseGet(() -> {
            data.put("message", "Invalid Credentials");
            return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
        });
    }
}
