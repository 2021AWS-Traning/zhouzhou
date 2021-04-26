package com.thoughtworks.dockertest.controller;

import com.thoughtworks.dockertest.dao.EmployeeDao;
import com.thoughtworks.dockertest.request.EmployeeRequest;
import com.thoughtworks.dockertest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/test")
    public String test() {
        return "hello";
    }

    @PostMapping("/information")
    public EmployeeDao getEmployeeInformation(@RequestBody EmployeeRequest employeeRequest) {
        return employeeService.getEmployeeInformation(employeeRequest.getFirstName());
    }
}
