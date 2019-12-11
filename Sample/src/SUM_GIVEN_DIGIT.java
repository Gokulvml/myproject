import java.util.Scanner;

public class SUM_GIVEN_DIGIT {
	
	
	public static void main (String args[])
	{
		int sum=0, last_digit;
	
		int number = 123;
		int c= 4;
		int d;
		
		
		while (number>0)
		{
			d=c%5;
			System.out.println("dvalue"+d);
			
			last_digit= number%10;
			
			System.out.println("LAST_digit"+last_digit);
			sum = sum+last_digit ;
			System.out.println("sum"+sum);
			System.out.println("Before"+number);
			
			number=number/10;
			System.out.println("AFter"+number);
			
			
		}
		System.out.println("SUM of  digit are"+sum);
	}
	
	

}
