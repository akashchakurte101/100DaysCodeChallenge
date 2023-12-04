package SingleTon;

public class LazyInitilaztion {
   private static LazyInitilaztion INSTANCE;

   private LazyInitilaztion()
   {

   }

   public static LazyInitilaztion getINSTANCE()
   {
       if(INSTANCE==null){

           INSTANCE=new LazyInitilaztion();
       }
       return INSTANCE;
   }
}
class LazyInilizationMain{
    public static void main(String[] args) {

        LazyInitilaztion Object1=LazyInitilaztion.getINSTANCE();
        LazyInitilaztion Object2=LazyInitilaztion.getINSTANCE();
        System.out.println(Object1.hashCode());
        System.out.println(Object2.hashCode());
    }
}
