public class Palindrome
{
	public static boolean isPalindrome(int x)
	{
		int originalNum = x;
		int temp1 = 0;
		int temp2 = 0;

		if(x < 0)
		{
			return false;
		}
		else
		{
			while(x != 0)
			{
				temp1 = x%10;
				temp2 = (temp2 * 10) + temp1;
				x = x / 10;
			}
		}

		return originalNum == temp2;
	}
	
	public static void main(String args[])
	{
		System.out.println(isPalindrome(-10));
	}
}