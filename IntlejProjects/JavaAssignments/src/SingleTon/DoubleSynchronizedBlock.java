package SingleTon;

public class DoubleSynchronizedBlock {

    private static DoubleSynchronizedBlock INSTANCE;

    private DoubleSynchronizedBlock()
    {

    }

    public synchronized static DoubleSynchronizedBlock getINSTANCE()
    {
        //.........
        //'''''''
        //...........
        //......
        if(INSTANCE==null) {
            synchronized (DoubleSynchronizedBlock.class) {
                if(INSTANCE==null){
                    INSTANCE = new DoubleSynchronizedBlock();
                }

            }
        }
        return  INSTANCE;
        //''''''
        //..........
        //'''''''

    }
}
