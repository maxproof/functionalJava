package collections01;

import java.util.Arrays;

public class Collections01 {

	public static void main(String[] args) {
		
		for(int max = 100000; max < 100000000; max*=10) {//*10
			System.out.println("for max " + max);
			parallelSort(max);
			System.out.print(" and ");
			sequentialSort(max);
			System.out.println("");
		}

	}
	
	public static void sequentialSort(int max) {
		
		int[] data = new int[max];
		for(int i = 0; i < max; i++) {
			data[i] =(int)(Math.random()*100);
		}
		
		long t0 = System.currentTimeMillis();
		Arrays.sort(data);
		long t1 = System.currentTimeMillis();
		
		/*for(int i = 0; i< 10; i++) {
			System.out.println(data[i]);
		}*/
		
		System.out.print("sequential sort in " + (t1 - t0));

	}
	
	public static void parallelSort(int max) {
		
		int[] data = new int[max];
		for(int i = 0; i < max; i++) {
			data[i] =(int)(Math.random()*100);
		}
		
		long t0 = System.currentTimeMillis();
		Arrays.parallelSort(data);
		long t1 = System.currentTimeMillis();
		
		/*for(int i = 0; i< 10; i++) {
			System.out.println(data[i]);
		}*/
		
		System.out.print(" parallel sort in " + (t1 - t0));

	}

}
