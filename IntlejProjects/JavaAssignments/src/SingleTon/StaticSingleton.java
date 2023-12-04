package SingleTon;

public class StaticSingleton {

    private static StaticSingleton INSTANCE;

    static
    {
        try
        {
            //DB connectiom
            //User name
            //password
            INSTANCE=new StaticSingleton();
        }
        catch (Exception e)
        {
            throw new RuntimeException("Some thing went wrong");
        }
        finally {
            //close
        }
    }

    private StaticSingleton()
    {

    }

    public static StaticSingleton getInstance()
    {
        return INSTANCE;
    }
}

class StaticSingletonMain {
    public static void main(String[] args) {

        StaticSingleton Object1=StaticSingleton.getInstance();
        StaticSingleton Object2=StaticSingleton.getInstance();
    }
}
