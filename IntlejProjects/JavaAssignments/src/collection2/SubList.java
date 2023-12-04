package collection2;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {


        List<String> str=new ArrayList<>();

        str.add("Green");
        str.add("Red");
        str.add("Blue");
        str.add("Black");
        str.add("Ash");

        str= str.subList(0,3);
        System.out.println(str);


    }
}
