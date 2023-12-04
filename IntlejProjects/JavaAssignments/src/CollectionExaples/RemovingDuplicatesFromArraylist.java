package CollectionExaples;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicatesFromArraylist {

    public static void main(String[] args) {

        List<Integer>  primes=new ArrayList<Integer>();

        primes.add(1);
        primes.add(2);
        primes.add(3);
        primes.add(4);
        primes.add(1);

        System.out.println("ArrayList with duplicates: "+primes);

        //passing object of List
        Set<Integer>  set=new LinkedHashSet<>(primes);

        System.out.println("set elements: "+ set);

        primes.clear();

        primes.addAll(set);

        System.out.println("After removing Duplicates: "+ primes);


    }
}
