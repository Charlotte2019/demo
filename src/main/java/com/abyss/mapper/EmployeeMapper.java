package com.abyss.mapper;

import com.abyss.dto.EmployeeDTO;
import com.abyss.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mayn
 */
@Mapper
@Repository
public interface EmployeeMapper {
    //查询全部员工信息

    /**
     * 获取全部员工操作
     * @return
     */
    List<EmployeeDTO> selectAllEmployeeDTO();


    /**
     * 根据id查询员工信息
     * @param id
     * @return
     */
    Employee selectEmployeeById(@Param("id") Integer id);

    /**
     * 添加一个员工信息
     * @param employee
     * @return
     */
    int addEmployee(Employee employee);

    /**
     * @param employee
     * @return
     * 修改一个员工信息
     */
    int updateEmployee(Employee employee);

    /**
     * @param id
     * @return
     * 根据id删除员工信息
     */
    int deleteEmployee(@Param("id") Integer id);

    /**
     * @param name
     * @return
     * 根据姓名查询员工
     */
    List<EmployeeDTO> selectEmployeeByName(String name);
}
