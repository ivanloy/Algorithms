package ivanloy.algorithms.apis.dataS;

import java.util.Iterator;

public class StequeL<Item> implements Iterable<Item>{

	private Node first;
	private Node last;
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
		
		if(n == 1) last = first;
		
	}
	
	public Item pop() {
		
		Item item = first.item;
		first = first.next;
		n--;
		return item;
		
	}
	
	public void enqueue(Item item) {
		
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty()) first = last;
		else          oldLast.next = last;
		oldLast.next = last;
		n++;
		
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
