package oop;

class Student2{
	int id;
	String name;
	
	Student2(int i,String n){
		id=i;
		name=n;
	}
	Student2(Student2 s){
		id=s.id;
		name=s.name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String args[]) {
		Student2 s1=new Student2(296,"Deepu");
		Student2 s2=new Student2(s1);
		//s2.display();
		s2.id=s1.id;
		s2.name=s1.name;
		s2.display();
	}
}