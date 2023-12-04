package Parent;

import java.util.Scanner;

public class Shapemain {

    public static void main(String[] args) {
        Shape shape = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which shape u want");
        String str = sc.next();
        if (str.equals("Triangle"))
        {
            shape = new Traingle(str);
           // shape.draw();
        }
        else if (str.equals("Sqaure"))
        {
            shape = new Square(str);
           // shape.draw();
        }
        else
        {
            System.out.println("There is no such pattern");
        }
        shape.draw();
    }
}