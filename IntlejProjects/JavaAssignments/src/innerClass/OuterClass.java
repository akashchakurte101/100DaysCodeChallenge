package innerClass;

public class OuterClass {

     static int x=10;
     int y=11;
     final int z=12;
     public static void vivo(){}
     void lava(){}
     private int outerData=0;
    public void outerMethod()
    {

       InnerClass2 inner2=new InnerClass2();
       inner2.innerClass2PublicMethod();
       inner2.innerClass2PrivateMethod();//??????


    }





    public class InnerClass
    {
       // OuterClass o=new OuterClass();// this valid but not able to call the members or methods of Outer class
       int x=11;

        public void innerMethod()
        {
            System.out.println("Inner method called");
            System.out.println(y);//11
            System.out.println(z);// 0 we can print but can't resign the value
          //  System.out.println(OuterClass.this.z=0);// not possible bcz it is final
            System.out.println(x);
            System.out.println(OuterClass.this.x);
            OuterClass.vivo();
        }
        private void innerClassPrivateMethod()
        {
            System.out.println("innerClassPrivateMethod");
        }
    }

    private class InnerClass2
    {
        private int innerData=0;

        private void innerClass2PrivateMethod()
        {
            innerData=outerData * 2;
            System.out.println(innerData);
        }
        public void innerClass2PublicMethod()
        {
            innerClass2PrivateMethod();
            System.out.println("Akash");
        }
    }

}
