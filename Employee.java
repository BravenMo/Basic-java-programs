package oop;

import java.util.Scanner;

public class Employee {

	String employeeID;
	String name;
	String designation;
	double salary;
	static String companyname;
	
	Employee(String employeeID, String name, String designation, double salary){
		this.employeeID=employeeID;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		Employee.companyname="Infosys";
	}
	
	void calchike() {
		System.out.println(designation);
		if(designation=="Manager") {
			salary=salary+((1/2)*salary);
		}
		if(designation=="Senior engineer") {
			salary=salary+((25/100)*salary);
		}
		if(designation=="Junior engineer") {
			salary=salary+((15/100)*salary);
		}
		else {
		}
		System.out.println(salary);
	}
	
	void display() {
		System.out.println("Attributes are: ");
		System.out.println(employeeID+" "+name+" "+designation+" "+salary+" "+companyname);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e[] =new Employee[1];
		for(int i=0;i<5;i++) {
			System.out.println("Enter employee details ");
			String id=sc.nextLine();
			String n=sc.nextLine();
			String d=sc.nextLine();
			double s=sc.nextDouble();
			e[i]=new Employee(id,n,d,s);
		}
		for(int j=0;j<5;j++) {
			e[j].display();
			e[j].calchike();
		}

	}

}
