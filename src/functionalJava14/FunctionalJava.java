package functionalJava14;

import java.util.Optional;

//USE OF OPTIONAL<T>

public class FunctionalJava {

	public static void main(String[] args) {

		/*
		 * int data2find = find("hello"); if(data == -1040) { //argh! } else { //ok }
		 */ // replaced with Optional<T>

		Optional<Integer> data2find = find("hello");
		
		if(data2find.isPresent()) {
			System.out.println("data: " + data2find.get());
		} else {
			System.out.println("no present");
		}
		
		data2find = find("fuck");
		
		if(data2find.isPresent()) {
			System.out.println("data: " + data2find.get());
		} else {
			System.out.println("no present");
		}

	}

	public static Optional<Integer> find(String str) {
		/*
		 * if(str == "fuck") { return 1; } else { return -1040; }
		 */
		// replaced with Optional<T>

		if (str == "fuck") {
			return Optional.of(1);//ok
		} else {
			return Optional.empty();//nothing to return, here NULL
		}
	}

}
