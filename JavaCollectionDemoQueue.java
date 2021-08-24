import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
public class JavaCollectionDemoQueue {
public static void main(String[] args) {
			
			doListDemo();
			doStackDemo();
			doQueueDemo();
		}
		private static void doListDemo() {
			System.out.println("In doListDemo");
			
			List<String> list = new LinkedList<>();
			
			list.add("vvjhbjb");
			list.add("jgfukyfukg");
			list.add("vkuykug");
			list.add("ts5dtfiui");
			
			Iterator itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				
			}
			
		}
		
		private static void doStackDemo() {
			System.out.println("\nIn doStackDemo");
			Stack<String> stack = new Stack<>();
			stack.push("ffkiygk");
			stack.push("nknknlkm");
			stack.push("bvjhvk");
			stack.push(" jmvmhkb");
			stack.push("hfcxhjc");
			String pop = stack.pop();
			Iterator<String> itr = stack.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		}
		
		private static void doQueueDemo() {
			System.out.println("\nIn doQueueDemo");
			PriorityQueue<String> queue = new PriorityQueue<>();
			queue.add("cfgcuhb");
			queue.add("strsrydy");
			queue.add("gchgnmkn");
			queue.add("cscssjhb");
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
