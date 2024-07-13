import org.example.employee.Employee;
import org.example.employee.FindAverageSalaryApp;
import org.junit.Test;

import java.util.List;

public class EmployeeTest {

    @Test
    public void test_employee_group() {
        FindAverageSalaryApp findAverageSalaryApp = new FindAverageSalaryApp();
        List<Employee> employeeData = findAverageSalaryApp.getEmployeeData();
        findAverageSalaryApp.findAverageSalary(employeeData);
    }
}
