package Assignment1;

public class FirstNonRepeatingNum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 4, 5};
        int size = arr.length;

        // Find the first element with a frequency of 1
        for (int i = 0; i < size; i++)
        {
            int count = 0;
            for (int j = 0; j < size; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("The first non-repeating integer is " + arr[i]);
                return;
            }
        }

        System.out.println("No non-repeating integer found.");
    }

    }

