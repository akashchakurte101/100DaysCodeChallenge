package Parent;

import java.util.Scanner;

public class Petmain {

    public static void main(String[] args)
    {
        Pet pet=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which pet name action u want");
        String petName=sc.next();
        if(petName.equals("dog"))
        {
            pet=new Dog();
        } else if (petName.equals("cat"))
        {
            pet=new Cat();
        }
        else
        {
            System.out.println("No such pet exists");
        }

        if(pet!=null)
        {
            pet.action();
        }
    }
}
