package collections03;

public class Collections03 {

	public static void main(String[] args) {
		
		Integer v = //Integer.MIN_VALUE;
				Integer.MAX_VALUE*2;
		
		for(int i = 0; i < 10; i++) {
			//System.out.println(v);
			System.out.println(Integer.toUnsignedString(v));
			v++;
		}

	}

}
