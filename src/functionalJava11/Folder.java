package functionalJava11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Folder {
	
	private String name;
	
	private List<File> child = new ArrayList<>();
	
	String getName() {
		return name;
	}
	
	List<File> getChild() {
		return child;
	}
	
	Folder(String name) {
		this.name = name;
	}
	
	void show(Consumer<Folder> out) {
		out.accept(this);
	}
	
	void add(File f) {
		child.add(f);
	}

}
