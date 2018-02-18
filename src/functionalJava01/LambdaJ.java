package functionalJava01;

interface PrintInterface {
	void print(String s);
}

interface PrintAnotherInterface {
	void print(String s, String t);
}

public class LambdaJ {

	public static void show(PrintInterface printer) {
		printer.print("hello");
	}
	
	public static void showST(PrintAnotherInterface printer) {
		printer.print("hello", "myAss");
	}
	
	public static void main(String[] args) {
		
		//old style with implements interface PrintInterface <- PrinterI
		PrinterI printerI = new PrinterI();
		printerI.print("bouh");
		
		//lambda style
		show(x -> System.out.println(x));
		//equivalent
		show(x -> { System.out.println(x + "!"); });
		
		show(x -> { 
			System.out.print(x + " ");
			System.out.println(x);	
			}
		);
		
		showST((x,y) -> {
			System.out.print(x + " ");
			System.out.println(y);
		});

	}

}
