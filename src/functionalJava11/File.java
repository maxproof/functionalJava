package functionalJava11;

import java.util.function.Consumer;

public class File {
	
	private String name;
	
	File(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void show(Consumer<File> out) {
		
		out.accept(this);
		
	}

}
