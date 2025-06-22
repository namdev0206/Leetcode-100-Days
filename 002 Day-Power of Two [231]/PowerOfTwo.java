public class PowerOfTwo
{
    public static boolean isPowerOfTwo(int n)
    {
        if(n == 1)
        {
            return true;
        }
        else if(n < 1 || n%2!=0)
        {
            return false;
            //System.out.println("Input less than or equal to 0 can not be the power of 2");
            //System.out.println("An Odd Number input can nor be the power of 2");
        }
        else
        {
            while(n >= 0)
            {
                n = n / 2;

                if(n == 1)
                {
                    return true;
                    //System.out.println(tempN + " is the power of Two");
                }
                else if(n%2!=0)
                {
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) 
    {
        System.out.println(isPowerOfTwo(16));
    }
}