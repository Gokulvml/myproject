package Employee;

public class EmployeeTest {
	
	String name;
	int age;
	String designation;
	Double salary;
	
	public EmployeeTest(String nameValue)
	{
		this.name = nameValue;
	}
	
	
	public void setAge(int ageValue)
	{
		age=ageValue;
	}

	public void setDesignation(String desigValue)
	{
		designation= desigValue;
	}
	public void setSalary(Double salaryValue)
	{
		salary= salaryValue;
	}
	
	public void printValue()
	{
		System.out.println("Name " + name);
		System.out.println("Age"+age );
		System.out.println("Designation"+ designation);
		System.out.println("SALARY" +salary );
	}
	
	public static void main (String[] args)
	{
		EmployeeTest employeeTest = new EmployeeTest("GokulVimalathithan");
		EmployeeTest newEmployee = new EmployeeTest("Sasikala");
		employeeTest.setAge(32);
		employeeTest.setDesignation("IT Analyst");
		employeeTest.setSalary(25000.09);
		employeeTest.printValue();
		
		newEmployee.setAge(25);
		newEmployee.setDesignation("MANAGER");
		newEmployee .setSalary(8000.09);
		newEmployee.printValue();
		
		
		
	}
}
