package Comparator;


//jar
public class Player {

    private int age;
    private String name;
    private int rating;
    public Player(int age,int rating , String name) {
        this.age = age;
        this.name = name;
        this.rating = rating;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
