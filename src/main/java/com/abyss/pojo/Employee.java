package com.abyss.pojo;

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
public class Employee {
    private Integer id;
    private String employeeName;
    private String email;
    /**
     * 0:女  1:男
     */
    private Integer gender;
    private Date date;
    private Integer departmentId;
}
