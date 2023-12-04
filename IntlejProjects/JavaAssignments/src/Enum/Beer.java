package Enum;

public enum Beer {

    /* enum is a group of named constants
       every constant in enu is a object of enum type
       In enum ; is optional
       enum may contain method,constructor,variables etc...
       first line in enum always should be constants
       enum is always public static final
       enum cona
     */

    KF(100),RC(90),KO(60);
    int price;
    Beer(int price)
    {
        this.price=price;
    }
    Beer()
    {
        this.price=65;
    }
    public int getPrice() {
        return price;
    }
}
class test{
    public static void main(String[] args) {
       // Beer b=Beer.RC;
        Beer[] b=Beer.values();
        for (Beer b1:b) {
            System.out.println(b1+"........"+b1.getPrice());
        }

    }
}