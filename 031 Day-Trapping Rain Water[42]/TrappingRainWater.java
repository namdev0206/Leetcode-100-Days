public class TrappingRainWater
{
    public int trap(int[] height) {
        int n = height.length ;
        int[] leftMax = new int[n];
        leftMax[0]=height[0];

        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }

        int ans = 0 ;
        for(int i=0;i<n;i++){
            ans += Math.min(leftMax[i],rightMax[i])-height[i];
        }

        return ans ;
    }

    public static void main(String args[])
    {
        TrappingRainWater trw = new TrappingRainWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int result = trw.trap(height);
        System.out.println("Trapped rain water: " + result);
    }
}