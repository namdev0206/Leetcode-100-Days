public class SortColors
{
    public void sortColors(int[] nums) {
        int low = 0 ;
        int mid = 0 ;
        int high = nums.length-1 ;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else if ( nums[mid]==1){
                mid++;
            }else{
                swap(nums,high,mid);
                high--;
            }
        }
    }

    public void swap(int[] nums , int i , int j ){
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k ;
    }

    public static void main(String args[])
    {
        SortColors sorter = new SortColors();
        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Input: ");
        printArray(nums);

        sorter.sortColors(nums);

        System.out.println("Output: ");
        printArray(nums);
    }

    public static void printArray(int[] nums) 
    {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}