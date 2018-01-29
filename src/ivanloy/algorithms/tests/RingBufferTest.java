package ivanloy.algorithms.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import ivanloy.algorithms.apis.dataS.RingBuffer;

class RingBufferTest {

	@Test
	void test() {
		
		RingBuffer<Integer> tester = new RingBuffer<Integer>(4);
		
		tester.enqueue(1);
		tester.enqueue(2);
		tester.enqueue(3);
		tester.enqueue(4);
		tester.enqueue(5);
		
		assertEquals(2, (int)tester.dequeue());
		assertEquals(3, (int)tester.getSize());
		assertEquals(3, (int)tester.dequeue());
		assertEquals(4, (int)tester.dequeue()); 
		assertEquals(5, (int)tester.dequeue());
		
	}

}
