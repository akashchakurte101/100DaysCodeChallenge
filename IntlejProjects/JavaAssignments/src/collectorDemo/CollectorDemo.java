package collectorDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorDemo {
    public static void main(String[] args) {


       Employee e1=new Employee(1,"Akash","Qa", 20, 20);
        Employee e2=new Employee(2,"Mahesh","Qc", 30, 30);
        Employee e3=new Employee(3,"Viresh","Qa", 40, 50);
        Employee e4=new Employee(4,"Ganesh","dev", 50, 50);
        Employee e5=new Employee(5,"Rakesh","support", 60, 55);
        Employee e6=new Employee(6,"Lokesh","DE", 80, 45);

        List<Employee> emplist=new ArrayList<>();
        emplist.add(e1);
        emplist.add(e2);
        emplist.add(e4);
        emplist.add(e3);
        emplist.add(e5);
        emplist.add(e6);

        //name-Dept

       String ouput=emplist.stream().
                map(emp->emp.getName()+"-"+emp.getDept()).
                collect(Collectors.joining(","));
        System.out.println("Output: "+ouput);

       //id=name-dept
      Map<Integer,String> maplist=emplist.stream().
                collect(Collectors.toMap(emp->emp.getId(),  //Value functio
                        emp->emp.getName()+"-"+emp.getDept()));//key function

        System.out.println("maplist: "+maplist);

        //Grouping by dep
      Map<String,List<Employee>> groupbyDept=emplist.stream().
                collect(Collectors.groupingBy(emp->emp.getDept()));


     Map<Boolean, List<Employee>> partion= emplist.stream().
              collect(Collectors.partitioningBy(emp->emp.getAge()>20));

        System.out.println(groupbyDept);

     long count= emplist.stream().
                filter(emp->"sdet".equals(emp.getName())).
                collect(Collectors.counting());
        System.out.println("Count of dept sdet: "+count);

        //Get noOfEmployeeInEachDep
                Map<String,Long> noOfEmployeeInEachDep=emplist.stream().
                collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));

         // (Alternative one)Get noOfEmployeeInEachDep
         Map<String ,List<Employee>> dep=emplist.stream().
                    collect(Collectors.groupingBy(emp->emp.getDept()));
        System.out.println("Dep: "+dep);

         Map<String,Integer> noOfEmployeeInEachDept=dep.entrySet().
                 stream().collect(Collectors.toMap(e->e.getKey(),e->e.getValue()  .size()));

           System.out.println(noOfEmployeeInEachDep);
            System.out.println(noOfEmployeeInEachDept);


    }
}
