package SingleTon;

import sun.security.jca.GetInstance;

public class EagerInitilization {

    private static final EagerInitilization INSTANCE=new EagerInitilization();

    private EagerInitilization()
    {

    }

    public static EagerInitilization getInstance()
    {
        return INSTANCE;

    }
}
class SingleTon{
    public static void main(String[] args) {

        EagerInitilization Object1=EagerInitilization.getInstance();
        EagerInitilization Object2=EagerInitilization.getInstance();
        System.out.println(Object1);
        System.out.println(Object2);
    }
}
