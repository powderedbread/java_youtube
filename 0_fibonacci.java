
public class Main {


    public static void main(String[] args)
    {
    fibonacci(0,1,10);
    }


    private static void fibonacci(int first, int second, int iterations)
    {

        String sequence= "" ;
        sequence = sequence + first + ", " + second + ", " ;
         int currentSum;

        for ( int i = 1; i < iterations ; i++)
        {
            currentSum= second + first;
            sequence = sequence + currentSum ;

            if (i < iterations-1)
            {sequence = sequence + ", ";}

            first =second;
            second=currentSum;
        }
        System.out.println(sequence);

    }

}



