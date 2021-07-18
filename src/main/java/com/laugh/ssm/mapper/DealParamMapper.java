package com.laugh.ssm.mapper;

import com.laugh.ssm.model.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;

/**
 * @author LaughTale
 */
public interface DealParamMapper {

    /**
     * MyBatis单参数解析
     *
     * @param id id
     * @return 员工
     */
    EmployeeEntity singleParam(Integer id);

    /**
     * 多参数解析
     *
     * @param id       id
     * @param lastName 姓名
     * @return 员工
     */
    EmployeeEntity twoParams(Integer id, String lastName);

    /**
     * 指定参数
     *
     * @param id       id
     * @param lastName 姓名
     * @return 员工
     */
    EmployeeEntity twoParamsSet(@Param("id") Integer id, @Param("lastName") String lastName);
}
