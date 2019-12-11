import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Model {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("welcome");

		List change = new ArrayList<>();
		change.add("a");
		change.add("b");
		Iterator itr = change.iterator();
		while(itr.hasNext())

		{
			Object element = itr.next();
			System.out.println("element"+element);

		}



	}

}
