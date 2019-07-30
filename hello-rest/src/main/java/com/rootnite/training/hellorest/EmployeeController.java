package com.rootnite.training.hellorest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @RequestMapping("")
    public List<Employee> getEmployees() {
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee(1, "Edy", "Huiza", "edy.huiza@rootnite.com"));
        return employeesList;
    }
}