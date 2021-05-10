package com.abyss.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @author mayn
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Integer id;
    private String employeeName;
    private String email;
    private Integer gender;
    private String departmentName;
    private Date date;
}
