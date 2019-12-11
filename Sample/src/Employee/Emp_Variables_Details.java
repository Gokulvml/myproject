package Employee;

public class Emp_Variables_Details {
	
	
	public Emp_Variables_Details()
	{
		System.out.println("Constructor ");
	}
	
	public static double salary;	 // class variable with static key word
	
	
	public void department_Local_variable(int b)
	{
		int c;  // local variable 
		
		int d =10; // local variable 
		c= d+b;
		System.out.println("department_Local_variable   " + c);		
		
	}
	
	public int e; // instaance variable 
	public void department_instance_variable( int f)
	{
		e=f;
		System.out.println("department_instance_variable   " + e);
	}
	
	public static void main (String args[])
	{
		Emp_Variables_Details emp_Variables_Details = new Emp_Variables_Details();
		
		salary= 12000.78;
		
		System.out.println("Class variable " +salary );
		emp_Variables_Details.department_instance_variable(100);
		emp_Variables_Details.department_Local_variable(500);
		
	}

}
