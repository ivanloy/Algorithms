package ivanloy.algorithms.mains;

import ivanloy.algorithms.apis.dataS.*;

public class Main {

	public static void main(String[] args) {
		
		RandomBag<Integer> s = new RandomBag<Integer>();
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		
		for(int j = 0; j < 100; j++) {
			
			for(int i : s) System.out.print(i + " ");
			System.out.println();
			
		}
	}

}
