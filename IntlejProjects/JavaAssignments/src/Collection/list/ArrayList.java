package Collection.list;

import java.util.*;

public class ArrayList<E> {
    public static void main(String[] args) {
        Person p1=new Person(20,"geeta");
        Person p2=new Person(21,"geet");
        Person p3=new Person(22,"gee");
        Person p4=new Person(23,"geeta");

        List<Person> pList=new java.util.ArrayList<>();

        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        pList.add(p4);


        Iterator<Person> pListIterator=pList.iterator();

        while (pListIterator.hasNext())
        {
            Person p=pListIterator.next();
            System.out.println("Age of the person: "+p.getAge() + ", Name of the person: "+p.getName());

        }
        System.out.println(pList);
    }
}
