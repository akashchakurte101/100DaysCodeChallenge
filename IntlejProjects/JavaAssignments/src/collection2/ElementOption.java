package collection2;

import java.util.ArrayList;
import java.util.List;

public class ElementOption {

    public static void main(String[] args) {
        List<String> str=new ArrayList<>();

        str.add("Green");
        str.add("Red");
        str.add("Blue");
        str.add("Black");
        str.add("Ash");

        for (int i=0;i<str.size();i++)
        {
            System.out.println(str.get(i));
        }

    }
}
