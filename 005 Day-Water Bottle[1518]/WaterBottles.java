public class WaterBottles
{
    public static int numWaterBottles(int numBottles, int numExchange) 
    {
        int totalDrinkBottles = numBottles;
        int remainingEmptyBottles = 0;

        if(numExchange <= 1)
        {
            return -1;
        }
        else if(numExchange == 0)
        {
            return numBottles;
        }

        while(numBottles >= numExchange)
        {
            remainingEmptyBottles = numBottles % numExchange;

            numBottles = numBottles / numExchange;

            totalDrinkBottles = totalDrinkBottles + numBottles;

            numBottles = numBottles + remainingEmptyBottles;
        }

        return totalDrinkBottles;
    }

    public static void main(String[] args) 
    {
        System.out.println(numWaterBottles(10, 3));
    }
}