package Collection.list.LinkedListImplimention;

import java.util.*;
import java.util.LinkedList;
import java.util.List;

public class GiveElementAtspecificIndex {
    public static void main(String[] args) {

        List<String> list=new LinkedList<>();
        list.add("Sprite");
        list.add("CoCola");
        list.add("Pepsi");
        list.add("Sting");


       for(int i=0; i<list.size(); i++)
       {
           System.out.println("specified index "+i+" And the value is "+list.get(i));
       }

       //Removing a Element from specified index
        for(int i=0; i<list.size(); i++)
        {
            //System.out.println("specified index "+i+" And the value is "+list.get(i));
            if (i==2)
            {
                list.remove(i);
            }
        }
        System.out.println(list);

       //Swap elements
        Collections.swap(list,0,2);
        System.out.println(list);

        //Join two linkedList
        List<String> list1=new LinkedList<>();
        list1.add("Bottle");
        list1.add("jug");
        list1.add("Ambrella");
        list1.add("Tv");

        list.addAll(list1);
        System.out.println(list);

        //Coping one list to anthore
        System.out.println("Source list: "+list1);
        System.out.println("Desit list: "+list);
        Collections.copy(list,list1);
        System.out.println(list);

    }
}
