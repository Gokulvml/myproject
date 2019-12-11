package Employee;

public class Emp__Param_cons {
	int b;
	int c;
	
	Emp__Param_cons(int a)
	{
		this.b=a;
	}
	
	Emp__Param_cons()
	{
		c=100;
		
	}
	
	public static void main (String args[])
	{
		Emp__Param_cons emp__Param_cons =new Emp__Param_cons(30);
		
		System.out.println("Value of b \n" +emp__Param_cons.b);
		Emp__Param_cons emp__Param_cons2 = new Emp__Param_cons();
		System.out.println("value of a\n " + emp__Param_cons2.c);
	}

}
