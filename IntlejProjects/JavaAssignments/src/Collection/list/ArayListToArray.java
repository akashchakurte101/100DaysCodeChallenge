package Collection.list;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ArayListToArray {

    public static void main(String[] args) {


        List<String> list=new java.util.ArrayList<>();
        list.add("Akash");
        list.add("Mahesh");
        list.add("Nagesh");
        list.add("Viresh");

        String[] arr=new String[list.size()];

        for(String value:arr)
        {
            System.out.println(value);
        }

    }

}
