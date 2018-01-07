package ivanloy.algoritms.util;

import ivanloy.algorithms.apis.dataS.StackL;

public class Conversions {
	
	public static String infixToOutfix(String infix) {
		
		StackL<Character> stack = new StackL<Character>();
		StringBuffer outfix = new StringBuffer();
		
		for(int i = 0; i < infix.length(); i++) {
			
			char c = infix.charAt(i);
			
			if(Character.toString(c).matches("\\d")) outfix.append(c);
			else {
				
				if(stack.isEmpty()) stack.push(c);
				else {
					
					if(c == '(') stack.push('(');
					else if(c == ')') {
						
						while(stack.peek() != '(') {
							
							outfix.append(stack.pop());
							
						}
						
						stack.pop();
						
					}else {
						
						if(opPriority(c) > opPriority(stack.peek())) stack.push(c); 
						else {
							
							while(!stack.isEmpty() && opPriority(c) <= opPriority(stack.peek())) {
								
								outfix.append(stack.pop());
								
							}
							
							stack.push(c);
							
						}
					}
					
				}
				
			}
			
		}
				
		for(char cc : stack) {
			
			if(cc != '(') outfix.append(stack.pop());
			
		}
		
		return outfix.toString();
		
	}
	
	private static byte opPriority(char operator) {
		
		byte ret;
		
		switch(operator) {
			
			case '^' : ret = 3; break;
			case '*' : case '/' : ret = 2; break;
			case '+' : case '-' : ret = 1; break;
			default : ret = 0; break;
		
		}
		
		return ret;
		
	}
	
}
