
public class Fibonacci_number {
	
	
	public static void main( String args[])
	{
	
	int n = 1;
	int T1 = 0;
	int T2= 1;
	System.out.println("fibonacci number"+T1);
	System.out.println("fibonacci number"+T2);
	
	while (n<40)
	{
		n=T1+T2;
		System.out.println("fibonacci number" +n);
		T1=T2;
		T2=n;
		n++;
		
	}
	}

}
