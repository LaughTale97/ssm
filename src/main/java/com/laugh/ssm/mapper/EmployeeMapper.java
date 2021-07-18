package com.laugh.ssm.mapper;

import com.laugh.ssm.model.entity.EmployeeEntity;

public interface EmployeeMapper {
    EmployeeEntity getEmployeeById(Integer id);

    // mybatis会自动为增、删、改方法封装返回数据
    // 只需要将方法返回值改为Integer、Long、Boolean即可
    // 数值型返回的是修改了的数据库行数
    // 布尔型：如果修改行数大于1，则返回true，否则返回false
    Integer insertEmployee(EmployeeEntity employeeEntity);

    Boolean updateEmployeeById(EmployeeEntity employeeEntity);

    Integer deleteById(Integer id);
}
