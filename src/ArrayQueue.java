
public class ArrayQueue<E> {
	ArrayDeque<E> deq;

	public ArrayQueue() {
		deq = new ArrayDeque<E>();
	}

	public int size() {
		return deq.size();
	}

	public boolean isEmpty() {
		if (deq.isEmpty() == true)
			return true;
		else
			return false;
	}

	public void enqueue(E e) {
		deq.addFirst(e);

	}

	public E first() {
		return deq.first();
	}

	public E dequeue() {
		return deq.removeLast();

	}
	
	public String toString(){
		return deq.toString();
		
	}

}
