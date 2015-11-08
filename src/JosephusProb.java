
public class JosephusProb {

	public static <E> E JosephusProb(ArrayQueue<E> Q, int k) {
		if (Q.isEmpty())
			return null;
		while (Q.size() > 1) {
			for (int i = 0; i < k; i++) {
				Q.enqueue(Q.dequeue());
			}
			E e = Q.dequeue();
			System.out.println("  " + e + " is out");

		}
		return Q.dequeue();
	}

	public static <E> ArrayQueue<E> buildQueue(E a[]) {
		ArrayQueue<E> Q = new ArrayQueue<E>();
		for (int i = 0; i < a.length; i++) {
			Q.enqueue(a[i]);
		}

		return Q;
	}
	
	public static void main(String[] args){
		String[] a1 ={"Alice" , "Bob" , "Cindy" , "Doug" , "Ed", "Fred" , "Lance"};
		System.out.println("Winner is: " + JosephusProb(buildQueue(a1) , 3));
		String[] a2 ={"Alice" , "Bob" , "Cindy" , "Doug" , "Ed", "Fred" , "Lance" , "Oliver"};
		System.out.println("Winner is: " + JosephusProb(buildQueue(a2) , 4));
		String[] a3 ={"Alice" , "Bob" , "Cindy" , "Doug" , "Ed", "Fred" , "Lance" ,"Joseph" , "Marshall" , "Eddie"};
		System.out.println("Winner is: " + JosephusProb(buildQueue(a3) , 5));

		
		
		
	}

}
