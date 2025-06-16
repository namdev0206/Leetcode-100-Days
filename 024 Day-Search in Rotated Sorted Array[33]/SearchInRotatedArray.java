public class SearchInRotatedArray
{
    public int search(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length-1;

        while(start<=end){
            int mid = (start + end)/2;
            if(nums[mid]==target){
                return mid ;
            }else if (nums[start]<=nums[mid]){ // first part is sorted

            if(target>=nums[start] && target<nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }

            }else{ // second part is sorted
                if(target>nums[mid] && target<=nums[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1 ;
    }

    public static void main(String[] args) 
    {
        SearchInRotatedArray searcher = new SearchInRotatedArray();

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = searcher.search(nums, target);
        System.out.println("Output: " + result);
    }
}