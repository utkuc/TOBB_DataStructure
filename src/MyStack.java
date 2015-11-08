
public class MyStack<E extends Object> implements Stack<E> {
	protected int cap ;
	private int size;
	private int top;
	public static final int CAP = 100;
	private E elements[];
	public MyStack(){
		this(CAP);
	}
	
	MySLList<E> list ;
	
	public MyStack(int s) {
		cap = s;
		elements =(E[]) new Object[cap];
		top = -1; // liste bos

	}

	public void push(E o) {
		elements[++top] = o;
		size++;

	}

	public E pop() {
		E temp;
		temp = elements[top];
		size--;
		elements[top] = null;
		return temp;
	}

	public E top() {
		return elements[top];
	}

	public int size() {
		return size;

	}

	public boolean isEmpty() {
		if (size() == 0)
			return true;
		return false;

	}

}
