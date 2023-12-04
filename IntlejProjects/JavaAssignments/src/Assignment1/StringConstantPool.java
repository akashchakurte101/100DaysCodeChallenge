package Assignment1;

abstract class StringConstantPool {

    public static void main(String[] args) {
        String s1="Akash";
        String s2="Akash";
        String s3="akash";

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println("\n");

        String s4=new String("Akash");
        String s5=new String("Akash");
        String s6=new String("akash");

        System.out.println(s4==s5);
        System.out.println(s4==s6);
        System.out.println(s4.equals(s5));
        System.out.println(s4.equals(s6));
    }

}
