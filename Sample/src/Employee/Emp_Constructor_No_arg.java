package Employee;

public class Emp_Constructor_No_arg {
int a;
	public Emp_Constructor_No_arg()
	{
		a=100;
	}
	
	public static void main (String args [])
	{
		Emp_Constructor_No_arg T1= new Emp_Constructor_No_arg();
		
		System.out.println("Value 1 Details "    + T1.a + "   " +  "value 2 details " +T1.a);
	}

}
