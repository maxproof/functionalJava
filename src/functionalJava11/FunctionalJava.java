package functionalJava11;

public class FunctionalJava {

	public static void main(String[] args) {
		
		Folder fo = new Folder("dir");
		
		File fi = new File("data.txt");
		
		//fi.show(f -> System.out.println(f.getName()));
		
		fo.add(fi);
		
		fo.show((Folder fol) -> {
			System.out.println("Folder: " + fol.getName());
			for(File f : fol.getChild()) {
				f.show(fil -> System.out.println(" " + fil.getName()));
			}
		});

	}

}
