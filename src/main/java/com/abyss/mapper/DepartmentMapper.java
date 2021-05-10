package com.abyss.mapper;

import com.abyss.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mayn
 */
@Mapper
@Repository
public interface DepartmentMapper {
    /**
     * 获取全部部门
     * @return
     */
    List<Department> selectAllDepartment();
}
