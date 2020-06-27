package com.zeta.spotlight.demo.controller;

import com.zeta.spotlight.demo.controller.response.EmployeeResponse;
import com.zeta.spotlight.demo.model.Employee;
import com.zeta.spotlight.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/management")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{corp_id}/employee")
    public @ResponseBody
    EmployeeResponse getAllEmployeesByCorp(@PathVariable Long corp_id) {
        Optional<List<Employee>> data = employeeService.getAllEmployeesByCorp(corp_id);
        return new EmployeeResponse(data, "");
    }

    @PostMapping("/{corp_id}/employee")
    public @ResponseBody
    EmployeeResponse addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return new EmployeeResponse(null, "Employee Saved");
    }

    @DeleteMapping("/{corp_id}/employee/{id}")
    public @ResponseBody
    EmployeeResponse deleteEmployee(@PathVariable Integer id) {
        String msg = employeeService.deleteEmployee(id) == 1 ? "Employee Deleted" : "Unable to Delete Employee";
        return new EmployeeResponse(null, msg);
    }
}
