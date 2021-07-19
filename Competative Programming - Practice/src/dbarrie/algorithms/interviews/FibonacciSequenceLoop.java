package dbarrie.algorithms.interviews;

public class FibonacciSequenceLoop {
	
	public static void main(String[] args) {
		printSequence();
	}
	
	public static void printSequence() {
		
		long a = 0, b = 1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0; i < 50; i++) {
			long next = a+b;
			System.out.println(next);
			a = b;
			b = next;
		}
		
	}

}
