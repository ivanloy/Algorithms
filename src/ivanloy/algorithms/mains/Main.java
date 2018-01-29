package ivanloy.algorithms.mains;

import ivanloy.algorithms.apis.dataS.*;

public class Main {

	public static void main(String[] args) {
		
		RingBuffer<Integer> s = new RingBuffer<Integer>(4);
		
		s.enqueue(1);
		s.enqueue(3);
		s.enqueue(-1);
		s.enqueue(23);
		s.enqueue(-21);
		s.enqueue(-213); 
		
		System.out.println(s.dequeue());
		System.out.println(s.dequeue());
		System.out.println(s.dequeue());
		System.out.println(s.dequeue());
		
	}

}
