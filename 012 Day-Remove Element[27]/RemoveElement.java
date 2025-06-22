public class RemoveElement
{
    public static int removeElement(int nums[], int val)
    {
        int count = 0;

        // Move non-val elements to the front
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String args[])
    {
        int num[] = {0, 2, 3, 1, 5, 6, 1, 0, 4, 1};
        int newLength = removeElement(num, 1);
        System.out.println(newLength);
    }
}