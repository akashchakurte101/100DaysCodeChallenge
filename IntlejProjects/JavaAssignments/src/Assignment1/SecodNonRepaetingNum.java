package Assignment1;

public class SecodNonRepaetingNum {

   public static void main(String[] args)
   {
       int[] numbers={1,1,2,3,3,5};
       int k=0;
       int[] x=new int[k];
       for(int i=0; i<numbers.length; i++)
       {
           int count=0;
           for(int j=0; j<numbers.length; j++)
           {
               if(numbers[i]==numbers[j])
               {
                   count++;
               }
           }
           if(count==1)
           {
               x[k]=numbers[i];

           }
       }
       System.out.println(x[1]);
//      for(int i=0; i<x.length; i++)
//      {
//
//              System.out.println(x[i]);
//
//      }
   }
}
