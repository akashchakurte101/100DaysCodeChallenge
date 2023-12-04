package innerClass;

public class OuterClass1 {

        private int x = 5;

        public void outerMethod() {
            final int y = 10;

            class InnerClass {
                public void innerMethod() {
                    System.out.println("x = " + x); // Accesses the private member of the outer class
                    System.out.println("y = " + y); // Accesses the final variable of the outer method
                }
            }

           InnerClass inner = new InnerClass();
            inner.innerMethod();
        }





    }

