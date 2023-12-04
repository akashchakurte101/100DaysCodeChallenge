package Assignment1;

import collectorDemo.Employee;

import java.util.ArrayList;
import java.util.List;

public class MethodGenericsDemo {

    private List<List<Person1>> sublistSplit(List<Person1> l, int i){

        List<List<Person1>> E=new ArrayList<>();
        int j=l.size() /i;
        while (l.listIterator().hasNext()){

            for(int k=0; k<=j; k++)
            {
              //  E=l.get(k);
              //  E.add(k);
            }

        }
    }
}
