
public class Node<E> {
	E element;

	protected Node<E> next;

	public Node(E e) {
		this.element = e;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

}