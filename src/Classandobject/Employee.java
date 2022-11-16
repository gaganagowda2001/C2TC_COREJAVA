package Classandobject;

public class Employee {
	int id;
	String name;
	float salary;
	Employee(){
		System.out.println("user defined no arguements"+"constructor executed");
	}
void display() {
	System.out.println(id + " " + name + " " + salary);
}
}
