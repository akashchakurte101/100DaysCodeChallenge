package CollectionExaples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveMethod {

    public static void main(String[] args) {


        List<Integer>  num=new ArrayList<>();

        num.add(1);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(2);

        num.remove(2);
        num.remove(new Integer(5));

        Iterator<Integer> itr=num.iterator();

        while(itr.hasNext())
        {
            Integer number=itr.next();
            if(number%2==0)
            {
                itr.remove();
            }
        }

        System.out.println(num);
    }
}
