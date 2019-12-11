package Employee;

import java.util.HashSet;
import java.util.Iterator;

public class Collection_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		set.add("Gokul");
		set.add("Vimal");
		set.add("Athithan");
		set.add("Athithan");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println("Value"+itr.next());
			
		}

	}

}
