package org.example.employee;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private String firstName;
    private String lastName;
    private String department;
    private String officeLocation;
    private String designation;
    private Double salary;
}