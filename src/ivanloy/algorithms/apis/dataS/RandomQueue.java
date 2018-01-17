package ivanloy.algorithms.apis.dataS;

public class RandomQueue<Item>{

	private int size;
	private Item[] queue;
	
	public RandomQueue() {
		
		size = 0;
		queue = (Item[]) new Object[2];
		
	}
	
	public RandomQueue(int maxSize) {
		
		this.size = 0;
		queue = (Item[]) new Object[maxSize];
		
	}
	
	public void enqueue(Item item) {
		
		if(size >= queue.length) resize(size * 2);
		queue[size++] = item;
		
	}
	
	public Item dequeue() {
		
		int random = (int)(Math.floor(Math.random() * size));
		
		Item item = queue[random];
		
		queue[random] = queue[--size];
		queue[size] = null;
		 
		return item;
		
	}
	
	public void resize(int max) {
		
		Item[] queue_ = (Item[]) new Object[max];
		for(int i = 0; i < size; i++) queue_[i] = queue[i];
		queue = queue_;
		
	}
	
}
