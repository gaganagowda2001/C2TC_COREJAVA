package Classandobject;

public class Cricketer {
	String name="Dhoni";
	int age=39;
	String color="brown";
	String role="batsman";
	String nationality="indian";
	void Display() {
		System.out.println("i love cricket");
	}
	public static void main(String[] args) {
	System.out.println("main method started");
	Cricketer c=new Cricketer();
	c.Display();
	System.out.println("main method ended");
	
	}
}
