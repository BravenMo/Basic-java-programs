package programming;

public class Student {
		 int rollno;  
		 String name;  
		 void insertRecord(int r, String n){  
		  rollno=r;  
		  name=n;  
		 }  
		 void displayInformation(){
			 System.out.println(rollno+" "+name);
		}    

		 public static void main(String args[]){  
		  Student s1=new Student();  
		  Student s2=new Student();  
		  s1.insertRecord(111,"Karan");  
		  s2.insertRecord(222,"Aryan");  
		  s1.displayInformation();  
		  s2.displayInformation();  
		  Student s3=new Student();
		  s3.rollno=333;
		  s3.name="Mohit";
		  s3.displayInformation();
		 }  
		  
}
