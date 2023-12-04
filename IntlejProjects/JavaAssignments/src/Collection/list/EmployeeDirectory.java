package Collection.list;

import java.util.List;

public class EmployeeDirectory implements EmployeeDirectoryInterface {
    private List<Employee> allEmployeeList;

    public EmployeeDirectory() {
     //   allEmployeeList = new ArrayList<>();
    }
    public void regesterEmployee(Employee employee) {
        allEmployeeList.add(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        for(Employee employee:allEmployeeList)
        {
            if(employee.getId()==id)
            {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void removeEmpolyee(int id) {
     Employee removeEmployee = null;
     for(Employee emloyee: allEmployeeList)
     {
         if(emloyee.getId()==id)
         {
             removeEmployee=emloyee;
             break;
         }
         if(removeEmployee !=null)
         {
           allEmployeeList.remove(removeEmployee);
         }
     }
    }

    @Override
    public List<Employee> getAllEmployees() {
        return allEmployeeList;
    }

    @Override
    public void printAllEmployeeHierarchy() {
      for(Employee employee:allEmployeeList)
      {
          System.out.println("Employee id: "+employee.getId());
          System.out.println("Employee name: "+employee.getName());
          if(employee.getManager()!=null)
          {
              System.out.println("Manger: "+ employee.getManager().getName());
          }
          System.out.println("........................");
      }
    }
}
