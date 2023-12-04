package Collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ArrayListSort {

    public static void main(String[] args) {

        List<Integer> l=new ArrayList<Integer>();

        l.add(5);
        l.add(8);
        l.add(6);
        l.add(9);
        System.out.println("Before sorting :"+l);


        TreeSet t=new TreeSet(l);
        System.out.println("After sort: "+t);

    }
}
