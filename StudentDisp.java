package programming;

public class StudentDisp {
	int id;
	String name;
	
	StudentDisp(int i,String n){
		id=i;
		name=n;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		StudentDisp s1= new StudentDisp(50396,"Pradeep");
		StudentDisp s2=new StudentDisp(50394,"Nachiyappan");
		
		s1.display();
		s2.display();
	}

}
