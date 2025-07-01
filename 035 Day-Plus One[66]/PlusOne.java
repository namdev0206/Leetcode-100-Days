public class PlusOne
{
    public int[] plusOne(int[] digits) {
       int n = digits.length;
       if(digits[n-1]!=9){
           digits[n-1]=digits[n-1]+1;
           return digits;
       }

       digits[n-1]=0;
       for(int i=n-2;i>=0;i--){

           if(digits[i]!=9){
               digits[i]=digits[i]+1;
               return digits;
           }
           digits[i]=0;
       }

       int[] ans = new int[n+1];
       ans[0]=1;
       return ans ;
    }

    public static void main(String[] args)
    {
        PlusOne solution = new PlusOne();
        int[] digits = {4,3,2,1};

        int[] result = solution.plusOne(digits);

        // Print the result
        System.out.print("Output: [");
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length -1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}