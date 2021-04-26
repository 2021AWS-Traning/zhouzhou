package com.thoughtworks.dockertest.mapper;

import com.thoughtworks.dockertest.dao.EmployeeDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {
    @Select("SELECT * FROM employees WHERE first_name = #{firstName}")
    EmployeeDao getEmployeeInformation(@Param("firstName") String firstName);
}
