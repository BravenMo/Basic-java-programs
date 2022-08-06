package programming;
import java.util.*;
class Employee{
	String name,designation,companyname;
	 double salary;
	 int id;
	 
	 Employee(int id,String name,String designation,String companyname,double salary) {
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.companyname=companyname;
		this.salary=salary;
		
	}
	 void calc(){
		 if(designation.equals("manager"))
			 salary=salary+(salary*50/100);
		 else if(designation.equals("Sr engineer"))
			 salary=salary+(salary*25/100);
		 else if(designation.equals("Jr engineer"))
			 salary=salary+(salary*15/100);
	 }
	public void display() {
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Designation:"+designation);
		System.out.println("Comapny name"+companyname);
		System.out.println("Salary"+salary);
	}
}

public class ArrayObj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee[] st=new Employee[5];
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++) {
    int id=sc.nextInt();
	String name=sc.nextLine();
	String d=sc.nextLine();
	String c=sc.nextLine();
	double s=sc.nextDouble();
	st[i]=new Employee(id,name,d,c,s);
}
for(int i=0;i<5;i++) {
	st[i].calc();
	st[i].display();
	
	
	
	
}
	}

}
