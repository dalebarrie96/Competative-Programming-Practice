package dbarrie.algorithms.interviews;

public class FibonacciSequenceRecursion {
	
	static int count = 0;
	
	public static void main(String[] args) {
		
		calculateNext(0, 1);
		
	}
	
	public static void calculateNext(int  a, int b) {
		count ++;
		
		System.out.println(a);
		int next = a+b;
		if(count <= 10) {
			calculateNext(b, next);
		}
	}

}
