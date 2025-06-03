public class MissingNumberInArray
{
    public int missingNumber(int[] nums) 
    {
        int range = nums.length;
        int actualSum =  (range * (range + 1))/2;
        int currSum = 0 ;
        for(int i=0;i<nums.length;i++){
            currSum = currSum + nums[i];
        }
        int ans = actualSum - currSum ;
        return ans ;
    }

    public static void main(String[] args) 
    {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};  // Input array
        MissingNumberInArray obj = new MissingNumberInArray();  // Create object
        int result = obj.missingNumber(nums);  // Call method
        System.out.println("Missing number is: " + result);  // Output result
    }
}