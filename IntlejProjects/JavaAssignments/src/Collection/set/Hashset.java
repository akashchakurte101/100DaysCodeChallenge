package Collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {
    public static void main(String[] args) {

        Set<String> name=new HashSet<>();
        name.add(" ");
        name.add("B");
        name.add("C");
        name.add(" A");
        name.add("E");
        name.add("C");
        System.out.println(name);

        Set<String> name1=new HashSet<>();
        name1.add("Danish");
        name1.add("Apple");
        name1.add("Boll");
        name1.add("Cat");
        name1.add("Ganesh");
        name1.add(" ");
        name1.add("guru");

        System.out.println(name1);

//        Set<String> name2=new HashSet<>();
//        name2.add("Mahesh");
//        name2.add("Ganesh");
//        name2.add("suresh");
//        name2.add("vagesh");
//        name2.add("guru");
//        name2.add("Kapila");
//
//        System.out.println(name2);
         Set<Integer> num=new HashSet<>();
         num.add(5);
         num.add(8);
         num.add(1);
         num.add(2);
        System.out.println(num);
        Set<Integer> num2=new HashSet<>();
        num2.add(1);
        num2.add(2);
        num2.add(5);
        num2.add(8);
        System.out.println(num2);


        Set o=new HashSet();
        o.add("A");
        o.add(2);
        o.add(5);
        o.add("b");

        System.out.println(o);


        Set<String> str=new LinkedHashSet<>();
        str.add("Nagessh");
        str.add("Nagessh");
        str.add("Aksh");
        str.add("Narendr");


        Set<String> strs=new TreeSet<>();
        strs.add("Nagessh");
        strs.add("Nagessh");
        strs.add("Aksh");
        strs.add("Narendr");

        System.out.println(strs);


    }




}
