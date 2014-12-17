import java.util.LinkedList;

public class LinkedListDemo {
	public static void main (String [] args){
		System.out.println("Demo Linked Lists");
		
		// create a linked list
      	LinkedList<String> linklist = new LinkedList<String>();
      
      	// add elements to the linked list
      	linklist.add("A");
      	linklist.add("B");
      	linklist.add("C");
      	linklist.add("D");
      	linklist.add("E");
      	System.out.println("Original contents of linklist: " + linklist);

      	// insert elements into particular parts
      	linklist.addFirst("1A");
      	linklist.addLast("Y");
      	linklist.addLast("Z");
      	linklist.add(1, "2A");
      	System.out.println("Contents of linklist after insertion: " + linklist);

      	// delete elements 
      	linklist.remove("E");
      	System.out.println("Contents of linklist after deleting elements: " + linklist);

      	// delete elements at first, last, and indexes 
      	linklist.remove(1);
      	linklist.removeFirst();
      	linklist.removeLast();
      	System.out.println("Contents of linklist after delete first, last, and index elements: " + linklist);

      	// get and set a value
      	Object val = linklist.get(2);
      	linklist.set(2, (String) val + " Changed");
      	System.out.println("linklist after change: " + linklist);
	}
}