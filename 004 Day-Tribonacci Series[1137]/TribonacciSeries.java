public class TribonacciSeries
{
    public static int tribonacci(int n) 
    {
        if(n == 0)
        {
            return 0;
        }else if(n == 1 || n == 2)
        {
            return 1;
        }

        int zeroTerm = 0;
        int firstTerm = 1;
        int secondTerm = 1;

        for(int i = 1; i <= n; i++)
        {
            int thirdTerm = zeroTerm + firstTerm + secondTerm;

            zeroTerm = firstTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
        
        return zeroTerm;
    }

    public static void main(String[] args) 
    {
        System.out.println(tribonacci(25));    
    }
}