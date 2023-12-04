package Parent;

import java.sql.SQLOutput;

public class Square extends Shape{

    public Square(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
