package collection2;

import java.util.ArrayList;
import java.util.List;

public class Compare {
    public static void main(String[] args) {

        List<String> str=new ArrayList<>();

        str.add("Green");
        str.add("Red");
        str.add("Blue");
        str.add("Black");
        str.add("Ash");

        List<String> str1=new ArrayList<>();

        str1.add("Green");
        str1.add("Blue");
        str1.add("Black");
        str1.add("Ash");

        List<String> str2=new ArrayList<>();

        for(String e:str)
        {
            if(str1.contains(e))
            {
                str2.add(e+" present in both");
            }
            else
            {
                str2.add(e+" present in only one");

            }
        }
        System.out.println(str2);
    }
}
