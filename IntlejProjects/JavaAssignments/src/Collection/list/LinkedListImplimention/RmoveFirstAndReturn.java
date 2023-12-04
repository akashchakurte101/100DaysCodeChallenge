package Collection.list.LinkedListImplimention;

import java.util.LinkedList;
import java.util.List;

public class RmoveFirstAndReturn {
    public static void main(String[] args) {

        LinkedList l=new LinkedList();
        l.add("Balawindar");
        l.add(5);
        l.add(8);
        l.add('@');

        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        //it will return simply first element
        System.out.println(l.peek());

        //it will remove 1st element and return the value
        System.out.println(l.pop());

        //It will add the element at first index by default
        l.push("7896");
        System.out.println(l);



    }
}
