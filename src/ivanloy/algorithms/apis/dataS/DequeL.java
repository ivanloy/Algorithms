package ivanloy.algorithms.apis.dataS;

import java.util.Iterator; 

public class DequeL<Item> implements Iterable<Item> {

	private Node first;
	private Node last;
	private int n;
	
	private class Node{
		
		Node next;
		Node prev;
		Item item;
		
	}
	
	public int size() { return n; }
	public boolean isEmpty() { return first == null; }
	
	public void pushLeft(Item item) {
		
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		first.prev = null;
		
		n++;
		
		if(n == 1) last = first;
		else oldFirst.prev = first;
	}
	
	public Item popLeft() {
		
		Item item = first.item;
		if(n > 1) { 
			
			first = first.next;
			first.prev = null;
			
		}else {
			
			first = null;
			last = null;
			
		}
		
		n--;
		return item;
		
	}
	
	public void pushRight(Item item) {
		
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.prev = oldLast;
		last.next = null;
		if(isEmpty()) first = last;
		else          oldLast.next = last;
		oldLast.next = last;
		n++;
		
	}
	
	public Item popRight() {
		
		Item item = last.item;
		if(n > 1) {
			
			last = last.prev;
			last.next = null;
			
		}
		else {
			
			first = null;
			last = null;
			
		}
		
		n--;
		return item;
		
	}
	
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
