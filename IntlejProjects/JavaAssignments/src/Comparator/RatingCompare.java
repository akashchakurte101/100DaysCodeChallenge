package Comparator;

import java.util.Comparator;

public class RatingCompare implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {

        return  Integer.compare(o1.getRating(),o2.getRating());
    }


}
