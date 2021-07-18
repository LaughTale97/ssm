package com.laugh.ssm.model.entity;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import com.laugh.ssm.mapper.EmployeeMapper;

import java.io.IOException;
import java.io.InputStream;

public class EmployeeEntityTest {

    private SqlSession getSqlSession() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // true 开启自动提交事务
        return sqlSessionFactory.openSession(true);
    }

    @Test
    public void test() throws IOException {
        try (SqlSession sqlSession = getSqlSession()) {
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            EmployeeEntity employeeEntity = new EmployeeEntity(null, 1, "Tom", "xxxx@xxx.com");
            employeeMapper.insertEmployee(employeeEntity);
            System.out.println(employeeMapper.getEmployeeById(employeeEntity.getId()));

            employeeEntity.setEmail("hahahahahaha");
            employeeMapper.updateEmployeeById(employeeEntity);
            System.out.println(employeeMapper.getEmployeeById(employeeEntity.getId()));

            employeeMapper.deleteById(employeeEntity.getId());
            System.out.println(employeeMapper.getEmployeeById(employeeEntity.getId()));
        }
    }
}
