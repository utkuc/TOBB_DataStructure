
public class ArrayDeque<E> implements Deque<E> {
	private int size;
	private E elements[];
	private int tail;
	private int head;
	private int cap;

	public ArrayDeque() {
		this(16);
	}

	public ArrayDeque(int cap) {
		elements = (E[]) new Object[cap];
		head = 1;
		tail = 0;
		size = 0;
		this.cap = cap - 1;

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	@Override
	public E first() {
		return elements[(head - 1) % cap];
	}

	@Override
	public E last() {
		return elements[(tail + 1) % cap];
	}

	@Override
	public void addFirst(E e) {
		elements[head] = e;
		head = (head + 1) % cap;
		size++;
	}

	@Override
	public void addLast(E e) {
		elements[tail] = e;
		tail = (tail + 1) % cap;
		size++;
	}

	@Override
	public E removeFirst() {
		head = (head - 1) % cap;
		size--;
		return elements[head];
	}

	@Override
	public E removeLast() {
		tail = (tail + 1) % cap;
		size--;
		return elements[tail];
	}
	/*
	 * public String toString(){ String ss =""; for(int i = 0 ; i<tail ; i++){
	 * ss = ss+ elements[i] ; } return ss;
	 * 
	 * }
	 */

}
