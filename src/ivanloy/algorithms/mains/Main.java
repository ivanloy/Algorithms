package ivanloy.algorithms.mains;

import ivanloy.algorithms.apis.dataS.*;

public class Main {

	public static void main(String[] args) {
		
		DequeL<Integer> s = new DequeL<Integer>();
		
		s.pushLeft(1);
		s.pushRight(2);
		s.pushRight(3);
		s.pushRight(4);
		s.pushLeft(5);
		s.pushRight(6);
		
		//System.out.println(s.popLeft() + " " + s.popLeft() + " " + s.popLeft() + " " + s.popLeft() + " " + s.popLeft() + " " + s.popLeft() + " " + s.isEmpty() + " " + s.size());
		//System.out.println(s.popRight() + " " + s.popRight() + " " + s.popRight() + " " + s.popRight() + " " + s.popRight() + " " + s.popRight() + " " + s.isEmpty() + " " + s.size());
		System.out.println(s.popLeft() + " " + s.popRight() + " " + s.popLeft() + " " + s.popRight() + " " + s.popLeft() + " " + s.popRight() + " " + s.isEmpty() + " " + s.size());
	}

}
