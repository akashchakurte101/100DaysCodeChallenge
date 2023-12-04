package Java8;

import java.util.Arrays;
import java.util.Optional;

class Person{
    Car car;
    Person(Car car)
    {
        this.car=car;
    }
    public Car getCar()
    {
        return car;
    }
}
class Car{
    Insurance insurance;
    Car(Insurance insurance)
    {
        this.insurance=insurance;
    }
    public Insurance getInsurance()
    {
        return insurance;
    }
}
class Insurance {
    String name;
    Insurance(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }
}
public class OptionMain {
    public static void main(String[] args) {
       User user=getUserById(100);
        System.out.println(user);

    }

    public static  User getUserById(int id){
        User user=null;
        if(id==200){
            user=new  User(1,"A","1/05/2023", Arrays.asList("pune"));
        }
        return user;
    }

    public static Optional<User> getUserByJava8(int i){
        User user=null;
        if(i==200){
            Optional.of(new User(1,"A","1/03/2023",Arrays.asList("pune")) );
        }
        return Optional.empty();
    }

}
