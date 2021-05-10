package com.abyss.service;

import com.abyss.pojo.Department;

import java.util.List;

/**
 * @author mayn
 */
public interface DepartmentService {
    /**
     * 获取全部部门
     * @return
     *
     */
    List<Department> selectAllDepartment();
}
