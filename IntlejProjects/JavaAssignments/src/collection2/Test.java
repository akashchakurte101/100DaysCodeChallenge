package collection2;

import Collection.list.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class  Test {

    public static void main(String[] args) {

        List<Integer>  mumber=new ArrayList<>();

        mumber.add(1);
        mumber.add(2);
        mumber.add(3);
        mumber.add(4);
        mumber.add(5);
        mumber.add(9);
        mumber.add(8);

        System.out.println(mumber);
//
//        for (int no:mumber)
//        {
//            System.out.println(no);
//        }

            Iterator<Integer> itr=mumber.iterator();
            while (itr.hasNext())
            {
                int no=itr.next();
                if(no==4)
                {
                    itr.remove();
                }
            }
        System.out.println(mumber);

            mumber.add(0,10);
            System.out.println(mumber);
            mumber.remove(0);
           System.out.println(mumber);
            mumber.set(0,88);
        System.out.println(mumber);

      if(mumber.contains(5))
      {
          System.out.println("found");
      }

     //sorting a list

        List<Customer> emp=new ArrayList<>();
         emp.add(new Customer(1,"Mahesh",2000));
         emp.add(new Customer(5,"Naresh",9000));
        emp.add(new Customer(8,"Karesh",8000));
        emp.add(new Customer(9,"paresh",7000));
        emp.add(new Customer(5,"saresh",1000));




        Iterator<Customer> cos=emp.iterator();
        while (cos.hasNext())
        {

            System.out.println(cos.next());
        }

      //  Collections.sort(emp);




    }
}
