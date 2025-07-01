import java.util.PriorityQueue;

public class KthLargestElement
{
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();

       for(int i=0;i<nums.length;i++){

           if(pq.size()<k){
               pq.add(nums[i]);
           }else if ( pq.peek()<nums[i]){
               pq.remove();
               pq.add(nums[i]);
           }
       }

       return pq.peek();
    }

    public static void main(String args[])
    {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        KthLargestElement solution = new KthLargestElement();
        int result = solution.findKthLargest(nums, k);

        System.out.println("The " + k + "th largest element is: " + result);
    }
}