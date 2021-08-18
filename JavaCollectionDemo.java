import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class JavaCollectionDemo {
	public static void main(String[] args) {
		
		doListDemo();
		doStackDemo();
		doQueueDemo();
		doSetDemo();
		doMapDemo() ;
	
		
	}


	private static void doListDemo() {
		System.out.println("In doListDemo");
		
		List<String> list = new LinkedList<>();
		
		list.add("Krati");
		list.add("Shreya");
		list.add("Akshat");
		list.add("Virat");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}
	
	private static void doStackDemo() {
		System.out.println("\nIn doStackDemo");
		Stack<String> stack = new Stack<>();
		stack.push("vgjhkhbkm");
		stack.push("rstrthrt");
		stack.push("vxtrhdtrhdh");
		stack.push("gfgfdtr");
		stack.push("strhtrh");
		String pop = stack.pop();
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	private static void doQueueDemo() {
		System.out.println("\nIn doQueueDemo");
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("aaaaaa");
		queue.add("bbbbbb");
		queue.add("cccccc");
		queue.add("dddddd");
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
	
	
	private static void doSetDemo() {
		System.out.println("\nIn doSetDemo");
		Set<String> set = new LinkedHashSet<>();
		set.add("def");
		set.add("xyz");
		set.add("abc");
		for (String str :set) {
			System.out.println(str);	
		}
		
	}
	private static void doMapDemo() {
		System.out.println("\nIn doMapDemo");
		Map<Integer,String> map = new HashMap<>();
		map.put(100,"abc");
		map.put(101,"xyz");
		map.put(102,"tuv");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}
	
}	