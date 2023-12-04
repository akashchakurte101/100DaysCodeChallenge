package collection2;

import java.util.ArrayList;
import java.util.List;

public class Join {
    public static void main(String[] args) {

        List<String> str=new ArrayList<>();

        str.add("Green");
        str.add("Red");
        str.add("Blue");
        str.add("Black");
        str.add("Ash");
        List<String> str1=new ArrayList<>();

        str1.add("green");
        str1.add("blue");
        str1.add("black");
        str1.add("ash");

        List<String> str2=new ArrayList<>();
        str2.addAll(str);
        str2.addAll(str1);

        System.out.println(str2);
    }
}
