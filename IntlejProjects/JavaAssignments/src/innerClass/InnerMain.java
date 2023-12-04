package innerClass;

public class InnerMain {

    public static void main(String args[])
    {
        OuterClass outer=new OuterClass();

       // outer.outerMethod();// will print inner method called
      //  System.out.println(name());
        OuterClass.InnerClass innerClass=outer.new InnerClass();
      //  innerClass.innerMethod(); // will also print inner method called
        outer.outerMethod();
    }


}
