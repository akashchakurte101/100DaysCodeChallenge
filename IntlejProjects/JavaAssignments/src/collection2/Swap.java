package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Swap {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>();

        str.add("Green");
        str.add("Red");
        str.add("Blue");
        str.add("Black");
        str.add("Ash");

        System.out.println("before swap");
        for(String e:str)
        {
            System.out.println(e);
        }
        System.out.println("Ater swap");
        Collections.swap(str,0,2);
        for(String e:str)
        {
            System.out.println(e);
        }
    }
}
