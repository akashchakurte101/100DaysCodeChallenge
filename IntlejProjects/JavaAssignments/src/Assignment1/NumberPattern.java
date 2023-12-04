package Assignment1;

public class NumberPattern {

    public static void main(String[] args)
    {

        for(int i=1; i<=5; i++)
        {
            int x=1;
            for(int j=1; j<=5; j++)
            {
                if(j<=i)
                {
                    System.out.print(x++);
                }
            }
            System.out.print("\n");
        }
    }
}
