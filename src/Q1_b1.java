
public class Q1_b1 {
	public boolean ParanMatch(String s, int l) {
		MyStack<Character> stack = new MyStack<Character>(l);
		for (int i = 0; i < l; i++) {
			char c = s.charAt(i);
			if (c == '{' || c == '(' || c == '[') {
				stack.push(c);
			} else if (c == '}' || c == ')' || c == ']') {
				if (stack.isEmpty())
					return false;
				char last = stack.top();
				if (c == '}' && last == '{' || c == ')' && last == '(' || c == ']' && last == '[')
					stack.pop();
				else
					return false;

			}

		}
		if (stack.isEmpty())
			return true;

		else
			return false;
	}
	
	
	
	

}
