package Comparable;

import java.util.*;

public class PlyerTest {
    public static void main(String[] args) {
        Player p1=new Player(25,1,"Ganesh");
        Player p2=new Player(45,10,"Nanesh");
        Player p3=new Player(85,8,"vanesh");
        Player p4=new Player(55,5,"Harish");
        Player p5=new Player(15,2,"mallu");

        List<Player> player=new ArrayList<>();
        player.add(p1);
        player.add(p2);
        player.add(p3);
        player.add(p4);
        player.add(p5);

       // Collections.sort(player);
      //  System.out.println(player);

        TreeSet ply=new TreeSet(player);
        //System.out.println(ply);


        Set<Integer> number = new TreeSet<>(); //order natural order
        number.add(4);
        number.add(9);
        number.add(2);
        //no sorting
        //System.out.println(number);

        Set<String> name = new TreeSet<>(); //order natural order
        name.add("Sumit");
        name.add("Amit");
        name.add("Ravi");
        name.add("Mayank");
        name.add("Sourabh");


        Map<Player,Player> plyr=new HashMap<>();
        Map<String,String> str=new HashMap<>();

        str.put("D","mahesh");
        str.put("C","ganesh");
        str.put("B","ganesh");
        str.put("A","ganesh");
//        for(Map.Entry<String,String> strs:str.entrySet())
//        {
//            String key= strs.getKey();
//            String value= strs.getValue();
//            System.out.println("key"+key+" value"+value);
//        }

        plyr.put(p2,p2);//45
        plyr.put(p3,p3);//85
        plyr.put(p1,p1);//25
        plyr.put(p4,p4);//55
        plyr.put(p5,p5);//15
      //  plyr.put(p3,p1);
        //System.out.println(plyr);

        for(Map.Entry<Player,Player> players:plyr.entrySet())
        {
             Player key= players.getKey();
             Player value=players.getValue();
            System.out.println("Key"+key+"="+"value"+value);
        }

    }


}
