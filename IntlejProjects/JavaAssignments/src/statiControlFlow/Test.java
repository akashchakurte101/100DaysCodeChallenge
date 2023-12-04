package statiControlFlow;

public class Test {

    static int x=10;
    static
    {
        System.out.println("1st Static block");
        m1();
    }
    public static void m1()
    {
        System.out.println("x..."+x+"y...."+y);
    }
    static int y=9;
    static
    {
        System.out.println(" 2nd Static block");
        m1();
    }

    public static void main(String[] args) {
        Test t=new Test();
   }
}
