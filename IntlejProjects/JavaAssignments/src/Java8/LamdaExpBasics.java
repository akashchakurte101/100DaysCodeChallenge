package Java8;

import java.util.function.*;

public class LamdaExpBasics {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> swap=(a,b)->{
            System.out.println("Before swap a and b are: "+a+" "+b);
            int temp=0;
            temp=a;
            a=b;
            b=temp;
            System.out.println("After swap a and b are: "+a+" "+b);
            return 0;
        };

        swap.apply(2,4);

        Predicate<String>  str=s->{
            int i;
            i=s.length();
            System.out.println("string length is evern?");
            return i % 2==0;
             };
        boolean test=str.test("Example");
        System.out.println(test);

        Consumer<String> c=s->{
            System.out.println(s);
        };
        c.accept("Mahesh");

        Supplier<String> str1=()-> {String s="name";
        return s;};
        String m=str1.get();
        System.out.println(m);



    }
    }

