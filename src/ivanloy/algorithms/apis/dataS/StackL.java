 package ivanloy.algorithms.apis.dataS;

import java.util.Iterator;

public class StackL<Item> implements Iterable<Item>{

	private Node first;
	private int n;
	
	private class Node{
		
		Node next;
		Item item;
		
	}
	
	public int size() { return n; }
	public boolean isEmpty() { return first == null; }
	
	public void push(Item item) {
		
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		n++;
		
	}
	
	public Item pop() {
		
		Item item = first.item;
		first = first.next;
		n--;
		return item;
		
	}
	
	public Item peek() { return first.item; }
	
	public Iterator<Item> iterator(){ return new StackIterator(); }
	
	private class StackIterator implements Iterator<Item>{
		
		private Node current = first;
		
		public boolean hasNext() { return current != null; }
		
		public Item next() { 
			
			Item item = current.item;
			current = current.next;
			return item;
			
		}
		
	}
	
	public String toString() {
		
		StringBuffer s = new StringBuffer();
		for(Item i : this) {
			
			s.append(i + " ");
			
		}
		
		return s.toString();
		
	}
	
}
