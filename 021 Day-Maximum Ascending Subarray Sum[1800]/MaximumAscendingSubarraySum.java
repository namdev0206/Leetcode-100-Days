public class MaximumAscendingSubarraySum
{
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int currmax = nums[0];

        for(int i=1 ; i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                currmax = currmax + nums[i];
            }else {
                max = Math.max(max , currmax);
                currmax = nums[i];
            }
        }
         max = Math.max(max , currmax);
         return max ;
    }

    public static void main(String[] args) 
    {
        int[] nums = {10, 20, 30, 40, 50};

        MaximumAscendingSubarraySum mas = new MaximumAscendingSubarraySum();
        int result = mas.maxAscendingSum(nums);

        System.out.println("Maximum Ascending Subarray Sum: " + result);
    }
}