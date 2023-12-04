package Collection.list.LinkedListImplimention;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorAtIndex {
    public static void main(String[] args) {

        List<String> list=new LinkedList<>();
        list.add("Om");
        list.add("Nam");
        list.add("Shivay");
        list.add("Shiv shiv shivay");

        Iterator<String> itr=list.listIterator(3);

    }
}
