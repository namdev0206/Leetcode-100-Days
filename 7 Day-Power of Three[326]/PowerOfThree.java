//Number should not be even.
//Number 

public class PowerOfThree
{
    public static boolean isPowerOfThree(int n)
    {
        if(n%2==0 || n < 1)
        {
            return false;
            //System.out.println("Number is not the power of 3");
        }
        else if(n == 1)
        {
            return true;
            //System.out.println("Number is the power of 3");
        }
        else 
        {
            while(n >= 0)
            {
                n = n / 3;

                if(n == 1)
                {
                    return true;
                }
                else if(n%3!= 0)
                {
                    return false;
                }
            }
        }

        return false;
    }


    public static void main(String[] args) 
    {
        System.out.println(isPowerOfThree(27));
    }
}