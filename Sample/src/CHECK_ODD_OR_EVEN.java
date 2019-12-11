import java.util.Scanner;

public class CHECK_ODD_OR_EVEN {
	
	public static void main (String args[])
	{
		int a= 46;
		if( a%2 ==0)
		{
			System.out.println("given number is even"+a);
		}
		else
		{
			System.out.println("given number is odd"+a);
		}
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter anumber: ");
		int num = reader.nextInt();
		if (num %2 ==0)
		{
			System.out.println("given number is even"+num);
		}
		else
		{
			System.out.println("given number is odd"+num);
			System.out.println("else part ended");
		}
	}

}
