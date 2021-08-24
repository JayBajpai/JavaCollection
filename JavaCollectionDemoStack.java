import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class JavaCollectionDemoStack {

		public static void main(String[] args) {
			
			doListDemo();
			doStackDemo();
		
			
		}


		private static void doListDemo() {
			System.out.println("In doListDemo");
			
			List<String> list = new LinkedList<>();
			
			list.add("egdiweiuh");
			list.add("wegeguque");
			list.add("enrerij");
			list.add("bewiehiu");
			
			Iterator itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				
			}
			
		}
		
		private static void doStackDemo() {
			System.out.println("\nIn doStackDemo");
			Stack<String> stack = new Stack<>();
			stack.push("rwhroijio");
			stack.push("kjbkjno");
			stack.push("uygyug");
			stack.push("hbhiuihiuh");
			stack.push("gtfugiy");
			String pop = stack.pop();
			Iterator<String> itr = stack.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		}
		
	}	
