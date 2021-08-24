import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
public class JavaCollectionDemoSet {

public static void main(String[] args) {
			
			doListDemo();
			doStackDemo();
			doQueueDemo();
		
			
}


	private static void doListDemo() {
		System.out.println("In doListDemo");
			
		List<String> list = new LinkedList<>();
			
			list.add("fuygugi");
			list.add("gchch");
			list.add("gctytu");
			list.add("tddfytfu");
			
			Iterator itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				
			}
			
		}
		
		private static void doStackDemo() {
			System.out.println("\nIn doStackDemo");
			Stack<String> stack = new Stack<>();
			stack.push("gchgcjg");
			stack.push("hgcjgvj");
			stack.push("chgchgv");
			stack.push("cyctyvu");
			stack.push("Prags");
			String pop = stack.pop();
			Iterator<String> itr = stack.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		}
		
		private static void doQueueDemo() {
			System.out.println("\nIn doQueueDemo");
			PriorityQueue<String> queue = new PriorityQueue<>();
			queue.add("rcgcgk");
			queue.add("nvxnsvx");
			queue.add("Shdsakbdkj");
			queue.add("jbdjkdlkd");
			System.out.println("head:" + queue.element());
			System.out.println("head:" + queue.peek());
			System.out.println("Iterating the queue elements");
			Iterator itr = queue.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			queue.remove();
			queue.poll();
			System.out.println("After Removing Two Elments");
			Iterator itr1 = queue.iterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			
					
		}
	}	

