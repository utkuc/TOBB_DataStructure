
public class Q1_b2 {

	private MyStack<String> stack;
	int p1;
	int p2;
	String result;

	public String method(String s) {
		stack = new MyStack<String>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c > '0' && c < '9') {
				stack.push(Character.toString(c));
			} else {
				p1 = Integer.parseInt("" + stack.pop());
				p2 = Integer.parseInt("" + stack.pop());
				switch (c) {
				case '+':
					stack.push(Integer.toString(p1 + p2));
					break;
				case '-':
					stack.push(Integer.toString(p1 - p2));
					break;
				case '/':
					stack.push(Integer.toString(p1 / p2));
					break;
				case '*':
					stack.push(Integer.toString(p1 * p2));
					break;
				default:
					System.out.println("Yanlis Dizilim Verildi");

				}

			}

		}

		result = stack.pop();
		return result;

	}

}
