package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);

        System.out.println("Before shuffle");
        System.out.println(list1);
        Collections.shuffle(list1);
       // Collections.shuffle(list1,5);
        System.out.println("After shuffle");
        System.out.println(list1);

    }
}
