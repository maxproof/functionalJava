package concurrence01;

//import java.util.Collections;
//import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;



public class Concurrence01 {
	
	private static Map<String, Integer> counter = 
			//Collections.synchronizedMap(new HashMap<String, Integer>(1990));
			new ConcurrentHashMap<String, Integer>(1990);
	
	private static void countIncrement(String string) {
		
		Integer cp = counter.get(string);
		if (cp == null) {
			counter.put(string,  1);
		}
		else
		{
			counter.put(string,  cp + 1);
		}
		
	}

	public static void main(String[] args) {
		
		countIncrement("chain");
		countIncrement("chain");
		countIncrement("chain");
		countIncrement("chain");
		
		counter.forEach((s, i) -> System.out.println("key " + s + " value " + i));
	}

}
