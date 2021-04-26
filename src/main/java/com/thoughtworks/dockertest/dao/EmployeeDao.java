package com.thoughtworks.dockertest.dao;

import lombok.Data;

@Data
public class EmployeeDao {
    private String firstName;
    private String lastName;
    private String department;
    private String email;
}
