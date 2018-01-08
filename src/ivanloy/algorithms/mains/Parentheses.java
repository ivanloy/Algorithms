package ivanloy.algorithms.mains;
import java.util.Scanner;

import ivanloy.algorithms.util.Calculus;
import ivanloy.algorithms.util.Conversions;

public class Parentheses {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String expression = scanner.next();
		scanner.close();
		
		//System.out.println(Conversions.infixToOutfix(expression));
		System.out.println(Calculus.evInfix(expression));
		
	}

}
