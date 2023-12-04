package Java8;

import java.util.List;

public class User {

    private int id;
    private  String name;
    private String dob;

    private List<String> cities;

    public User(int id, String name, String dob,List<String> cities) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.cities=cities;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", cities=" + cities +
                '}';
    }
}
