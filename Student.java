package oop;
public class Student {
	int rollno;
	String name;
	static String college="VIT";
	
	static void change() {
		college="Vellore";
	}
	
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {
		Student.change();
		Student s1=new Student(396,"Deepu");
		Student s2=new Student(397,"Swetha");
		Student s3= new Student(111,"Shanthi");
		s1.display();
		s2.display();
		s3.display();
	}
}
