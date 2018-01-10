package ivanloy.algorithms.apis.dataS;

import java.util.Iterator;

public class RandomBag<Item> implements Iterable<Item> {

	private int size;
	private Item[] bag;
	
	public RandomBag() {
		
		bag = (Item[]) new Object[2];
		size = 0;
		
	}
	
	public boolean isEmpty() { return size == 0; }
	public int getSize() { return size; }
		
	public void add(Item item) {
		
		if(size >= bag.length) resize(size * 2);
		bag[size++] = item;
				
	}
	
	private void resize(int max) {
		
		Item[] bag_ = (Item[]) new Object[max];
		for(int i = 0; i < size; i++) bag_[i] = bag[i];
		bag = bag_;
		
	}
	
	public Iterator<Item> iterator(){
		
		shuffle(); 
		
		return new RandomIterator(); 
		
	}
		
	private class RandomIterator implements Iterator<Item>{
		
		private int i = size;
		
		public Item next() { return bag[--i]; }
		public boolean hasNext() { return i > 0; }
		
	}
	
	private void shuffle() {
		
		int random;
		Item n;
		
		for(int i = size - 1; i > 0; i--) {
			
			random = (int)( Math.floor( Math.random() * (i + 1) ) );
			n = bag[random];
			bag[random] = bag[i];
			bag[i] = n;
			
		}
		
	}
	
}
