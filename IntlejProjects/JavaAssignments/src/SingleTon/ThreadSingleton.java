package SingleTon;

public class ThreadSingleton {
    private static ThreadSingleton INSTANCE;

    private ThreadSingleton()
    {

    }

    public synchronized static ThreadSingleton getINSTANCE()
    {
        if(INSTANCE==null){

            INSTANCE=new ThreadSingleton();
        }
        return INSTANCE;
    }
}
class  ThreadSingletonMain{
    public static void main(String[] args) {

    }
}
