package Employee;

import java.util.ArrayList;

public class Collection {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("hai");
		list.add("Gokul");
		list.add(null);
		list.add(2, "Gokul");
		for (String a :list)
		{
			System.out.println("Name"+a);
		}
		
				
		
	}

}
