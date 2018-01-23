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
		start = new Node();
		end = start;
		
	}

	public void enqueue(T item) {
	
		Node oldEnd = end;
		end = new Node();
		end.item = item;
		oldEnd.next = end; //TODO First node fix
		
		
	}
	
}
