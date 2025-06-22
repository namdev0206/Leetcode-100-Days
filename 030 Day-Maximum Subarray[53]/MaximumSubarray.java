public class MaximumSubarray
{
    public int maxSubArray(int[] nums) {
        int currsum = nums[0];
        int max = nums[0];

        for(int i=1;i<nums.length;i++){

            if(currsum + nums[i] > nums[i]){
                currsum+=nums[i];
            }else{
                currsum = nums[i];
            }

            max = Math.max(max , currsum);
        }
        return max ;
    }

    public static void main(String args[])
    {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        MaximumSubarray solution = new MaximumSubarray();
        int result = solution.maxSubArray(nums);

        System.out.println("Maximum subarray sum is: " + result);
    }
}