package org.example;

import dao.EmployeeDao;
import model.Customer;
import model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("application.context.xml");
         EmployeeService employeeDao=context.getBean("myService", EmployeeService.class);
      //  EmployeeService employeeDao=context.getBean("myService", EmployeeService.class);

        //  Customer customer=employeeDao.getCustomer();
          Employee employee=employeeDao.getEmployeeDao();

         //System.out.println(customer);
        System.out.println(employee);
    }
}
