package functionalJava10;

public class Fibonacci {
	
	static int[] sequence = {1, 2, 3, 5, 8, 13, 21, 34, 55};
	
	static int i = 0;
	
	static int next() {
		return sequence[i++];
	}

}
