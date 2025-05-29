import java.util.*;

public class TwoSum
{
    public static int[] twoSum(int[] nums, int target) 
    {
        int arrayLenght = nums.length;
        int ans[] = new int[2];

        for(int i = 0; i < arrayLenght; i++)
        {
            for(int j = i+1; j < arrayLenght; j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    public static void main(String args[])
    {
        int[] nums = {5, 7, 18, 3, 13, 8};
        System.out.println(Arrays.toString(twoSum(nums, 30)));
    }
}