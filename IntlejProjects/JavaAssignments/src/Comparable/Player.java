package Comparable;

import java.util.Objects;

public class Player implements Comparable<Player> {

    private int age;
    private int rating;
    private String name;

    public Player(int age, int rating, String name) {
        this.age = age;
        this.rating = rating;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "age=" + age +
                ", rating=" + rating +
                ", name='" + name + '\'' +
                '}';
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Player o) {
        //return Integer.compare(this.rating,o.rating);

       // return this.name.compareTo(o.name);
       //reverse logic
        //return Integer.compare(this.age, o.age);

        if(this.rating==o.rating)
        {
            return 0;
        } else if (this.rating<o.rating)
        {
            return -1;
        } else
        {
           return +1;
        }



    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return age == player.age && rating == player.rating && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, rating, name);


    }
}
