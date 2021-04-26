package com.thoughtworks.dockertest.service;

import com.thoughtworks.dockertest.dao.EmployeeDao;
import com.thoughtworks.dockertest.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public EmployeeDao getEmployeeInformation(String firstName) {
        return employeeMapper.getEmployeeInformation(firstName);
    }
}
