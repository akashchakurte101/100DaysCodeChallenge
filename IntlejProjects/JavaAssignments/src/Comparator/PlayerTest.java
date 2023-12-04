package Comparator;

import java.util.*;

public class PlayerTest {
    public static void main(String[] args) {
        Player p1=new Player(25,1,"Ganesh");
        Player p2=new Player(45,10,"Nanesh");
        Player p3=new Player(85,8,"vanesh");
        Player p4=new Player(55,5,"Harish");
        Player p5=new Player(15,2,"mallu");

        List<Player> list=new ArrayList<>();

        list.add(p3);
        list.add(p2);
        list.add(p1);
        list.add(p4);
        list.add(p5);
        list.add(p2);

        Collections.sort(list,new RatingCompare());

        for(Player p:list)
        {
            System.out.println(p);
        }

        Map<Player,Player> ply=new TreeMap<>(new RatingCompare());

        ply.put(p3,p3);
        ply.put(p2,p2);
        ply.put(p1,p1);
        ply.put(p4,p4);
        ply.put(p5,p5);

        for(Map.Entry<Player,Player> plyer: ply.entrySet())
        {
           System.out.println("key " +plyer.getKey()+" Value "+ plyer.getValue());
        }

       // System.out.println(ply);

       Set<Player> plyer=new TreeSet<>(new RatingCompare());

        plyer.add(p1);
        plyer.add(p2);
        plyer.add(p3);
        plyer.add(p4);
        plyer.add(p5);

       // Collections.sort(plyer,new RatingCompare());

       for(Player pl:plyer)
       {
           System.out.println(pl);
       }




    }
}
