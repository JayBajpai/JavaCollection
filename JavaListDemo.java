import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaListDemo {
	public static void main(String[] args) {
		
		doListDemo();
	
		
	}


	private static void doListDemo() {
		System.out.println("In doListDemo");
		
		List<String> list = new LinkedList<>();
		
		list.add("abc");
		list.add("def");
		list.add("ghi");
		list.add("jkl");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}
	
	
	
}	