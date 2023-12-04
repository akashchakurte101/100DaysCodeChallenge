package Collection.list;

import java.util.List;

public interface EmployeeDirectoryInterface {


    void regesterEmployee(Employee employee);
    Employee getEmployee(int id);
    void removeEmpolyee(int id);
    List<Employee> getAllEmployees();
    void printAllEmployeeHierarchy();
}
