package com.hdfc.collections;

import java.io.*;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


class Person implements Serializable {
    Integer id;
    transient String name;
    int age;

    boolean isAlive;

    public boolean getAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!Objects.equals(id, person.id)) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PersonAgeCompartor implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        if (person1.getAge() == person2.getAge()) {
            return 0;
        } else if (person1.getAge() < person2.getAge()) {
            return -1;
        } else {
            return +1;
        }
    }
}

public class ComparableTest {

    public static void serializeStudent(Person student) throws IOException {
        FileOutputStream fos = new FileOutputStream("person.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);//NotSerializableException
        oos.flush();
        oos.close();//Closes the stream. This method must be called to release any resources associated with
    }

    public static Person deSerializeStudent() throws IOException, ClassNotFoundException {
        FileInputStream fos = new FileInputStream("person.ser");
        ObjectInputStream oos = new ObjectInputStream(fos);
        Person john = (Person) oos.readObject();
        oos.close();//Closes the stream. This method must be called to release any resources associated with
        return john;
    }


    public static void main(String[] args) throws Exception {

        //Comparable
        //Number
        //1 < 2 < 3 < 100 < 102 < 500;
        //String
        //A < B < C < Z ASCII
        //a< b < c < Z ASCII


        Person p1 = new Person(3, "Sunny", 50);
        System.out.println(p1);
        serializeStudent(p1);


        Person p2 = deSerializeStudent();
        System.out.println(p2);
        //Person p2= p1.clone();//CloneNotSupportedException


        //Person cannot be cast to class java.lang.Comparable
        Set<Person> persons = new TreeSet<>(new PersonAgeCompartor());
        persons.add(new Person(3, "Sunny", 50));
        persons.add(new Person(2, "Gunny", 50));
        persons.add(new Person(1, "Bunny", 10));
        persons.add(new Person(5, "Hunny", 30));
        persons.add(new Person(4, "Runny", 40));


        //System.out.println("before:" + persons);
        //Collections.sort(persons, new PersonAgeCompartor());
        //System.out.println("after:" + persons);


    }
}

