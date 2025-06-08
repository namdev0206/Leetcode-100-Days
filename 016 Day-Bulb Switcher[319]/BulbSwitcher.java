import java.util.Scanner;

public class BulbSwitcher
{
    public int bulbSwitch(int n) 
    {
        int count = 0 ;
        int i = 1 ;

        while(i*i<=n){
            count++;
            i++;
        }
        return count ;
    }

    public static void main(String[] args) 
    {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of bulbs (n): ");
        int n = scanner.nextInt();

        BulbSwitcher bs = new BulbSwitcher();
        int result = bs.bulbSwitch(n);

        System.out.println("Number of bulbs that remain ON: " + result);
    }
}