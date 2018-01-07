package ivanloy.algoritms.util;

import ivanloy.algorithms.apis.dataS.StackL;

public class Calculus {

	static public double evOutfix(String outfix) {
		
		StackL<Double> operands = new StackL<Double>();
		
		for(int i = 0; i < outfix.length(); i++) {
			
			char c = outfix.charAt(i);
			
			if(Character.toString(c).matches("\\d")) operands.push((double)Character.getNumericValue(c));
			else {
				
				double n1 = operands.pop();
				double n2 = operands.pop();
				
				if(c == '+')      operands.push(n1 + n2);
				else if(c == '-') operands.push(n2 - n1);
				else if(c == '*') operands.push(n1 * n2);
				else if(c == '/') operands.push(n2 / n1);
				else if(c == '^') operands.push(Math.pow(n2, n1));
				
			}
			
		}
		
		return operands.pop();
		
	}
	
	static public double evInfix(String infix) {
		
		return evOutfix(Conversions.infixToOutfix(infix));
		
	}
	
}
