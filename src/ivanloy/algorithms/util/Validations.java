package ivanloy.algorithms.util;

import ivanloy.algorithms.apis.dataS.StackL;

public class Validations {

	public static boolean parentheses(String input) {
		
		StackL<Character> stack = new StackL<Character>();
		boolean ret = true;
		
		for(int i = 0; i < input.length(); i++) {
			
			switch(input.charAt(i)) {
			
				case '(' : case '[' : case '{' : stack.push(input.charAt(i)); break;
				case ')' : if(!stack.isEmpty() && stack.pop() != '(') ret = false; break;
				case ']' : if(!stack.isEmpty() && stack.pop() != '[') ret = false; break;
				case '}' : if(!stack.isEmpty() && stack.pop() != '{') ret = false; break;
				
			}
			
		}
		
		if(!stack.isEmpty()) ret = false;
		
		return ret;
		
	}
	
}
