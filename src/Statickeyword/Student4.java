package Statickeyword;

public class Student4 {
	int rollno;
	String name;
	static String college="its";
	Student4(int r,String n)
	{
		rollno=r;
		name=n;
	}
	static void change() {
		college="bbdit";
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args) {
	Student4 s1=new Student4(111,"karan");
	Student4 s2=new Student4(222,"aryan");
	s1.display();
	s2.display();



	}

}
