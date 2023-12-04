package Java8;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.List.*;

public class PersonMain {
    public static void main(String[] args) {
        Person1 p1=new Person1(4,"VIresh");
        Person1 p2=new Person1(30,"Akash");
        Person1 p3=new Person1(2,"Balu");
        Person1 p4=new Person1(5,"Anmol");
        Person1 p5=new Person1(19,"nagu");

        List<Person1>  personlist=new ArrayList();
        personlist.add(p1);
        personlist.add(p2);
        personlist.add(p3);
        personlist.add(p4);
        personlist.add(p5);

//        for(Person1 person1:person)
//        {
//            System.out.println(person1);
//        }
        String Output=personlist.stream().map(Person1::getName).collect(Collectors.joining(","));

        System.out.println(Output);

        long taken=System.currentTimeMillis();
       // System.out.println(taken);
        List<String> list= personlist.stream().
                map(abc -> abc.getName()).
                filter(def->def.startsWith("M")).
                collect(Collectors.toList());

        System.out.println(list);

        long Nowtaken=System.currentTimeMillis()-taken;
        //System.out.println(Nowtaken);


                List<String> plist=personlist.stream().
                map(Candidates->Candidates.getName().toUpperCase()).
                filter(Candidate->Candidate.startsWith("A")||Candidate.startsWith("B")).
                collect(Collectors.toList());

                System.out.println(plist);

        //List<Person> personList = List.of(p1, p2, p3, p4);
                List<Integer> intlist=new ArrayList<>();
                intlist.add(5);
                intlist.add(25);
                intlist.add(55);
                intlist.add(24);
                intlist.add(44);
                intlist.add(5);

             List<Integer> intlist1=intlist.stream().
                       filter(number-> number%2==0).
                       collect(Collectors.toList());

        System.out.println(intlist1);

      //Some Intermediate operation
      List<Person1> sortedlist = personlist.stream().
                sorted((name,name2)->name.getName().compareTo(name2.getName())).collect(Collectors.toList());






      List<Person1> p=new ArrayList<>();
      Person1 p6=new Person1(8,"Shubham");
      Person1 p7=new Person1(9,"Mahesh");
      Person1 p8=new Person1(10,"Sourabh");

      List<List<Person1>> newpersonlist=new ArrayList<>();
     // newpersonlist.add(personlist)
        List<Person1> List= newpersonlist.stream().
              flatMap(l->l.stream()).
              collect(Collectors.toList());

        System.out.println();



        //Treminal options
     Optional<Person1> findany=personlist.stream().
                filter(person->person.getName().startsWith("z")).
                findAny();
        System.out.println("Find any:"+findany);

        boolean  anymatch=personlist.stream().
                filter(person->person.getName().startsWith("M")).
                anyMatch(person-> person.getAge()==2);
        System.out.println("isAnyMacthisPresentinginPredicate: "+anymatch);

       boolean allmatch= personlist.stream().
                allMatch(person->person.getName().startsWith("A"));

        System.out.println("isAllMacthisPresentinginPredicate: "+allmatch);

       List<String> listPerson=personlist.stream().
                filter(person->person.getName().startsWith("A") && person.getAge()>18).
                map(person->"Mr "+person.getName()).
               collect(Collectors.toList());


        System.out.println("List pesron: "+listPerson);


















    }

}
