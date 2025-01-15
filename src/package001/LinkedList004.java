package package001;

import java.util.LinkedList;

public class LinkedList004 {
	public static void main(String[] args) {
		 LinkedList<String> ll=new LinkedList<String>();
		 ll.push("A");
		 ll.push("B");
		 ll.push("D");
		 ll.push("E");
		 ll.push("F");
		 ll.pop();
		 LinkedList<String> ll1=new LinkedList<String>();
		 ll1.offer("A");
		 ll1.offer("B");
		 ll1.offer("C");
		 ll1.offer("E");
		 ll1.offer("F");
		 //ll1.poll();
		 System.out.println(ll+","+ll1);
		 ll1.add(3,"D");
		 ll.add(2,"C");
		 System.out.println(ll+","+ll1);
		 ll1 .remove("F");
		 System.out.println(ll+","+ll1);
		 System.out.println(ll.peekFirst());
		 System.out.println(ll.peekLast());
		 ll.addFirst("0");
		 ll.addLast("0");
		 ll.removeFirst();
		 ll.removeLast();
		 System.out.println(ll);
	}
}
