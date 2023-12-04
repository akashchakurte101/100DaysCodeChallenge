package Collection.list;

import java.util.List;

public class EmployeeDirectoryRunner {

    public static void main(String[] args) {

        EmployeeDirectory employee=new EmployeeDirectory();

        Employee emp1=new Employee();
        emp1.setId(1);
        emp1.setName("Mahesh");

        Employee emp2=new Employee();
        emp1.setId(2);
        emp1.setName("Viresh");

        employee.regesterEmployee(emp1);
        employee.regesterEmployee(emp2);

       // List<Employee> allEmployee=employee.getAllEmployees();
    // Print all employees
        List<Employee> allEmployees = employee.getAllEmployees();
        for (Employee employeee : allEmployees) {
            System.out.println("Employee ID: " + employeee.getId());
            System.out.println("Name: " + employeee.getName());
            System.out.println("---------------------");
        }

        // Remove an employee
        employee.removeEmpolyee(1);

        // Print all employees after removal
        allEmployees = employee.getAllEmployees();
        for (Employee employeee : allEmployees) {
            System.out.println("Employee ID: " + employeee.getId());
            System.out.println("Name: " + employeee.getName());
            System.out.println("---------------------");
        }

        // Print employee hierarchy
        employee.printAllEmployeeHierarchy();

    }
}
