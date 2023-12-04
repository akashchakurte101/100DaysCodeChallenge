package Parent;

public class Traingle extends Shape{

    public Traingle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Traingle");
    }
}
