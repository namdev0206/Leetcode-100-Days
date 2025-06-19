public class SearchInsertPosition
{
    public int searchInsert(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length-1 ;

        while(start<=end){
            int mid = (start + end)/2;

            if(nums[mid]==target){
                return mid ;
            }else if ( target>nums[mid]){
                start = mid + 1;
            }else{
                end = mid -1 ;
            }
        }

        return start ;
    }

    public static void main(String[] args) 
    {
        SearchInsertPosition obj = new SearchInsertPosition();
        
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        int result = obj.searchInsert(nums, target);
        System.out.println("Output: " + result);
    }
}