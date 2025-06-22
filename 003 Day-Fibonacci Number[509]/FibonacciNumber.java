public class FibonacciNumber
{
    public static int fib(int n) 
    {
        //If user asking for the 0th term. Then the 0th term is already given.
        if(n == 0)
        {
            return 0;
        }
        //If user asking for the 1st term. Then the 1st term is already given.
        else if(n == 1)
        {
            return 1;
        }

        int firstNumber = 0;
        int secondNumber = 1;

        for(int i = 1; i <= n ; i++)
        {
            int thirdTerm = firstNumber + secondNumber;

            firstNumber = secondNumber;
            secondNumber = thirdTerm;
        }

        return firstNumber;
    }

    public static void main(String[] args) 
    {
        System.out.println(fib(5));
    }
}