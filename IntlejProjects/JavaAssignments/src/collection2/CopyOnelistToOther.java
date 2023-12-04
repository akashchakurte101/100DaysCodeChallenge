package collection2;

import java.util.*;

public class CopyOnelistToOther {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);

        System.out.println("List1 : "+list1);

        List<Integer> list2=new ArrayList<>();
        list2.add(10);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        System.out.println("List2 : "+list2);

        Collections.copy(list1,list2);

        System.out.println("Copy List2 to List1,\nAfter copy:");
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

    }

}
