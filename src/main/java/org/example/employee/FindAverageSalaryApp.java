package org.example.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindAverageSalaryApp {

    public void findAverageSalary(List<Employee> employees) {

        Map<String, Map<String, List<Employee>>> set1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getOfficeLocation,
                        Collectors.groupingBy(Employee::getDesignation)));

        set1.forEach((officeLocation, valueSet) -> {
            System.out.println("---------- "+officeLocation+" ----------");

            valueSet.forEach((position, positionedEmployees) -> {
                double averageSalary = positionedEmployees.stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .getAsDouble();
                System.out.println(" [ "+position+" ] :: average salary --> "+averageSalary);
            });
        });
    }

    public List<Employee> getEmployeeData() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ashish", "A", "IT", "Pune", "Software Engineer", 10000.0));
        employees.add(new Employee("Amit", "R", "HR", "Pune", "Recruiter", 12000.0));
        employees.add(new Employee("Ramesh", "D", "HR", "Pune", "Senior Recruiter", 14000.0));
        employees.add(new Employee("Jaya", "S", "IT", "Pune", "Tech Lead", 15000.0));
        employees.add(new Employee("Smita", "M", "IT", "Bangalore", "Recruiter", 16000.0));
        employees.add(new Employee("Umesh", "A", "IT", "Bangalore", "Software Engineer", 12000.0));
        employees.add(new Employee("Pooja", "R", "HR", "Bangalore", "Software Engineer", 12000.0));
        employees.add(new Employee("Ramesh", "D", "HR", "Pune", "Recruiter", 16000.0));
        employees.add(new Employee("Bobby", "S", "IT", "Bangalore", "Tech Lead", 20000.0));
        employees.add(new Employee("Vipul", "M", "IT", "Bangalore", "Software Engineer", 14000.0));
        return employees;
    }

}
