package com.abyss.service;

import com.abyss.dto.EmployeeDTO;
import com.abyss.pojo.Employee;

import java.util.List;

/**
 * @author mayn
 */
public interface EmployeeService {
    /**
     * 查询全部员工信息
     * @return
     */
    List<EmployeeDTO> selectAllEmployeeDTO();

    /**
     * 根据id查询员工信息
     * @param id
     * @return
     */
    Employee selectEmployeeById(int id);

    /**
     * 添加一个员工信息
     * @param employee
     * @return
     */
    int addEmployee(Employee employee);

    /**
     * 修改一个员工信息
     * @param employee
     * @return
     */
    int updateEmployee(Employee employee);

    /**
     * 根据id删除员工信息
     * @param id
     * @return
     */
    int deleteEmployee(int id);

    /**
     * 根据姓名查询员工
     * @param name
     * @return
     */
    List<EmployeeDTO> selectEmployeeByName(String name);
}
