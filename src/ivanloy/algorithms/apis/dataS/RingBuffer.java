package ivanloy.algorithms.apis.dataS;

public class RingBuffer<T> {
	
	private Node start;
	private Node end;
	private int size;
	private int maxSize;
	
	private class Node {
		
		Node next;
		T item;
		
	}
	
	public int getSize() { return size; }
	public boolean isEmpty() { return start == null; }
	
	public RingBuffer(int maxSize){
		
		this.size = 0;
		this.maxSize = maxSize;
		
	}

	public void enqueue(T item) {
	     
		if(size < maxSize) {
			
			Node oldEnd = end;
			end = new Node();
			end.next = null;
			end.item = item;
			if(isEmpty()) start = end;
			else 		  oldEnd.next = end;
			
		}else {
			
			end.next = start;
			start = start.next;
			end = end.next;
			end.item = item;
			end.next = null;
					
		}
		
		
		
		size++;
		
	}
	
	public T dequeue() {
		
		T item = start.item;
		
		start = start.next;
		if(isEmpty()) end = null;
		
		size--;
		
		return item;
		
	}
	
}
